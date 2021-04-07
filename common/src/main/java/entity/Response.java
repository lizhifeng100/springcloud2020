package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2021/4/1 14:40
 * @Created by 荔枝/260494
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private String message;

    private String code;

    private T data;

    public Response(String message, String code) {
        this(message, code, null);
    }


}
