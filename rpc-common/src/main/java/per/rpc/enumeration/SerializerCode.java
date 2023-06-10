package per.rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author sparkle6979l
 * @data 2023/6/10 17:55
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum SerializerCode {
    JSON(1);

    private final int code;
}
