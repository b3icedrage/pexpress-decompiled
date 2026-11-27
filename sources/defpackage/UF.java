package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UF {
    public static final void a(@Nullable InterfaceC3220cl interfaceC3220cl, @NotNull CommonResult<?> result, @Nullable String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (interfaceC3220cl == null) {
            return;
        }
        if (!(result instanceof ResultError)) {
            InterfaceC3220cl.a.a(interfaceC3220cl, EnumC4737jl.d, null, null, 6);
            return;
        }
        ResultError resultError = (ResultError) result;
        if (resultError.getError() instanceof CommonError.DuoAuthCanceled) {
            interfaceC3220cl.c(EnumC4737jl.g, str, c(resultError.getError()));
        } else {
            interfaceC3220cl.c(EnumC4737jl.e, str, c(resultError.getError()));
        }
    }

    @NotNull
    public static final String b(@NotNull CommonError commonError) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        String string = StringsKt.d0(StringsKt.X(commonError.getPlatformCode(), ':')).toString();
        int length = string.length();
        int code = commonError.getCode();
        if (length == 0) {
            strValueOf = String.valueOf(code);
        } else {
            strValueOf = code + ":" + string;
        }
        return KS1.B(48, strValueOf);
    }

    @NotNull
    public static final JX1 c(@NotNull CommonError commonError) {
        Intrinsics.checkNotNullParameter(commonError, "<this>");
        int code = commonError.getCode();
        String strF = C2017Sp1.a.b(commonError.getClass()).f();
        if (strF == null) {
            strF = "CommonError";
        }
        return new JX1(code, strF, b(commonError), commonError.getText(), commonError.getPlatformCode(), commonError.getCause(), commonError.getHttp());
    }
}
