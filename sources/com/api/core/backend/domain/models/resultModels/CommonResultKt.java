package com.api.core.backend.domain.models.resultModels;

import defpackage.C4718jg0;
import defpackage.InterfaceC6396rf0;
import defpackage.KS1;
import defpackage.PW0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"CoreBackendApi_pbRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommonResultKt {
    @NotNull
    public static final CommonError.OurServerError a(@Nullable CommonError commonError) {
        String str;
        CommonError.OurServerError ourServerError = new CommonError.OurServerError();
        if (commonError != null) {
            String platformCode = commonError.getPlatformCode();
            if (platformCode.length() <= 0) {
                platformCode = null;
            }
            String strConcat = platformCode != null ? "|".concat(platformCode) : null;
            if (strConcat == null) {
                strConcat = "";
            }
            str = commonError.getCode() + ":" + KS1.B(80, commonError.getText()) + strConcat;
        } else {
            str = null;
        }
        ourServerError.setPlatformCode(str != null ? str : "");
        ourServerError.setCause(commonError != null ? commonError.getCause() : null);
        Map<String, ? extends Object> http = commonError != null ? commonError.getHttp() : null;
        if (http == null) {
            http = PW0.c();
        }
        ourServerError.setHttp(http);
        return ourServerError;
    }

    @Nullable
    public static final <T> T b(@NotNull CommonResult<? extends T> commonResult) {
        Intrinsics.checkNotNullParameter(commonResult, "<this>");
        ResultOk resultOk = commonResult instanceof ResultOk ? (ResultOk) commonResult : null;
        if (resultOk != null) {
            return (T) resultOk.a();
        }
        return null;
    }

    @NotNull
    public static final CommonResultKt$okFilter$$inlined$filterIsInstance$1 c(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @Nullable String str) {
        Intrinsics.checkNotNullParameter(interfaceC6396rf0, "<this>");
        return new CommonResultKt$okFilter$$inlined$filterIsInstance$1(new C4718jg0(interfaceC6396rf0, new CommonResultKt$okFilter$1(str, null)));
    }
}
