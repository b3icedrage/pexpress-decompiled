package com.api.core.backend.domain.models.resultModels;

import defpackage.C1526Mj;
import defpackage.C6529sH0;
import defpackage.XE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "", "TRANSIENT_CODES", "Ljava/util/List;", "Lkotlin/text/Regex;", "TRANSIENT_HTTP_STATUS", "Lkotlin/text/Regex;", "", "HTTP_PREFIX", "Ljava/lang/String;", "HTTP_5XX_PREFIX", "JSON_CONTENT_TYPE", "CoreBackendApi_pbRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommonErrorClassificationKt {

    @NotNull
    private static final String HTTP_5XX_PREFIX = "http_5";

    @NotNull
    private static final String HTTP_PREFIX = "http_";

    @NotNull
    private static final String JSON_CONTENT_TYPE = "json";

    @NotNull
    private static final List<Integer> TRANSIENT_CODES;

    @NotNull
    private static final Regex TRANSIENT_HTTP_STATUS;

    static {
        CommonError.Codes[] elements = {CommonError.Codes.TimeoutException, CommonError.Codes.NotInternet, CommonError.Codes.NotWebSocketConnection, CommonError.Codes.VPN, CommonError.Codes.OurServerError, CommonError.Codes.ErrorTooManyRequests};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setH = C1526Mj.H(elements);
        ArrayList arrayList = new ArrayList(XE.m(setH, 10));
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((CommonError.Codes) it.next()).getValue()));
        }
        TRANSIENT_CODES = arrayList;
        TRANSIENT_HTTP_STATUS = new Regex("^http_(5\\d\\d|408|429)(:|$)");
    }

    public static final boolean a(@NotNull CommonError commonError) {
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        if ((commonError instanceof CommonError.TimeoutException) || (commonError instanceof CommonError.NotWebSocketConnection) || (commonError instanceof CommonError.NoInternet) || (commonError instanceof CommonError.VPNError)) {
            return true;
        }
        Throwable cause = commonError.getCause();
        if ((cause instanceof IOException) || (cause instanceof C6529sH0)) {
            return true;
        }
        if (cause instanceof NullPointerException) {
            String message = ((NullPointerException) cause).getMessage();
            if (message == null) {
                message = "";
            }
            if (d.o(message, "Response from", false)) {
                return true;
            }
        }
        return d.o(commonError.getPlatformCode(), HTTP_5XX_PREFIX, false) || b(commonError, commonError.getPlatformCode());
    }

    public static final boolean b(CommonError commonError, String str) {
        Object obj;
        String string;
        if (d.o(str, HTTP_PREFIX, false) && (obj = commonError.getHttp().get("content_type")) != null && (string = obj.toString()) != null) {
            if (StringsKt.I(string)) {
                string = null;
            }
            if (string != null) {
                return !StringsKt.C(string, JSON_CONTENT_TYPE, true);
            }
        }
        return false;
    }

    public static final boolean c(@NotNull CommonError commonError) {
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        return a(commonError) || (commonError instanceof CommonError.SessionMissing);
    }

    public static final boolean d(@NotNull CommonError commonError) {
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        if (!a(commonError)) {
            if (commonError.getCode() != CommonError.Codes.OurServerError.getValue() || commonError.getPlatformCode().length() <= 0) {
                return TRANSIENT_CODES.contains(Integer.valueOf(commonError.getCode())) || TRANSIENT_HTTP_STATUS.a(commonError.getPlatformCode());
            }
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.X(commonError.getPlatformCode(), ':'));
            if (intOrNull != null) {
                String strU = StringsKt.U('|', commonError.getPlatformCode(), "");
                if (!TRANSIENT_CODES.contains(intOrNull) && !TRANSIENT_HTTP_STATUS.a(strU) && !b(commonError, strU)) {
                    return false;
                }
            }
        }
        return true;
    }
}
