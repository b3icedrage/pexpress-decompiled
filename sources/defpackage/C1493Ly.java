package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1493Ly {
    public static final String a(CaptchaDestination captchaDestination) {
        if ((captchaDestination instanceof CaptchaDestination.Login) || (captchaDestination instanceof CaptchaDestination.SmsSend)) {
            L80 l80 = L80.MAX_PROFIT;
            return "Login";
        }
        if (captchaDestination instanceof CaptchaDestination.Registration) {
            L80 l81 = L80.MAX_PROFIT;
            return "Registration";
        }
        if (!(captchaDestination instanceof CaptchaDestination.RemindPass)) {
            throw new C6489s51();
        }
        EnumC5204lz enumC5204lz = EnumC5204lz.LAUNCH;
        return "Forgot password";
    }

    public static final void b(@NotNull ReporterApi reporterApi, @NotNull CaptchaDestination destination, @NotNull String reason, @Nullable String str, @Nullable String str2, @NotNull String from, @NotNull String flow) {
        EnumC5028l80 enumC5028l80;
        Intrinsics.checkNotNullParameter(reporterApi, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(flow, "flow");
        if ((destination instanceof CaptchaDestination.Login) || (destination instanceof CaptchaDestination.SmsSend)) {
            enumC5028l80 = EnumC5028l80.y;
        } else if (destination instanceof CaptchaDestination.Registration) {
            enumC5028l80 = EnumC5028l80.r;
        } else {
            if (!(destination instanceof CaptchaDestination.RemindPass)) {
                throw new C6489s51();
            }
            enumC5028l80 = EnumC5028l80.B;
        }
        ReporterApi.a.b(reporterApi, enumC5028l80, new C1416Ky(from, reason, str, str2, C3430dl.a(flow)), null, 12);
    }

    public static final void c(@NotNull ReporterApi reporterApi, @NotNull CaptchaDestination destination, @NotNull CommonError error, @NotNull String from, @NotNull String flow) {
        Intrinsics.checkNotNullParameter(reporterApi, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(flow, "flow");
        b(reporterApi, destination, "wrong_captcha", String.valueOf(error.getCode()), error.getText(), from, flow);
    }

    public static void d(ReporterApi reporterApi, CaptchaDestination captchaDestination, CommonError commonError, int i) {
        String strA = a(captchaDestination);
        String str = "register";
        if ((i & 8) != 0) {
            if ((captchaDestination instanceof CaptchaDestination.Login) || (captchaDestination instanceof CaptchaDestination.SmsSend)) {
                str = "login";
            } else if (!(captchaDestination instanceof CaptchaDestination.Registration)) {
                if (!(captchaDestination instanceof CaptchaDestination.RemindPass)) {
                    throw new C6489s51();
                }
                str = "forgot_password";
            }
        }
        c(reporterApi, captchaDestination, commonError, strA, str);
    }
}
