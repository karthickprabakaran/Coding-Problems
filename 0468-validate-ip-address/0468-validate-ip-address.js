/**
 * @param {string} queryIP
 * @return {string}
 */
var validIPAddress = function(queryIP) {
    if (queryIP.includes('.')) {
        return checkv4(queryIP);
    } else if (queryIP.includes(':')) {
        return checkv6(queryIP);
    }
    return "Neither";
};

function checkv4(str) {
    const chunks = str.split('.');
    if (chunks.length !== 4) return "Neither";

    for (let chunk of chunks) {
        // must not be empty and only digits
        if (!/^\d+$/.test(chunk)) return "Neither";
        // no leading zeros unless the number is 0
        if (chunk.length > 1 && chunk[0] === '0') return "Neither";
        // must be between 0 and 255
        if (+chunk < 0 || +chunk > 255) return "Neither";
    }
    return "IPv4";
}

function checkv6(str) {
    const chunks = str.split(':');
    if (chunks.length !== 8) return "Neither";

    const hexRegex = /^[0-9a-fA-F]{1,4}$/;
    for (let chunk of chunks) {
        if (!hexRegex.test(chunk)) return "Neither";
    }
    return "IPv6";
}