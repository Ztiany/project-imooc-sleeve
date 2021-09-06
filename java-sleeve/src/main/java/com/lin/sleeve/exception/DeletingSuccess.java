package com.lin.sleeve.exception;

import com.lin.sleeve.exception.http.HttpException;

/**
 * @author Ztiany
 * Email ztiany3@gmail.com
 * Date 2021/2/3 21:11
 */
public class DeletingSuccess extends HttpException {

    public DeletingSuccess(int code) {
        this.httpStatusCode = 200;
        this.code = code;
    }

}
