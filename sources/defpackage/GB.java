package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.core.backend.domain.models.responseModels.CommonCaptchaDestinationsResponse;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class GB implements EB {

    @NotNull
    public final InterfaceC1131Hh a;

    public GB(@NotNull InterfaceC1131Hh appRepositoryApi) {
        Intrinsics.checkNotNullParameter(appRepositoryApi, "appRepositoryApi");
        this.a = appRepositoryApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Enum b(GB gb, CaptchaDestination captchaDestination, LM lm) {
        FB fb;
        Object next;
        if (lm instanceof FB) {
            fb = (FB) lm;
            int i = fb.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb.h = i - Integer.MIN_VALUE;
            } else {
                fb = new FB(gb, lm);
            }
        } else {
            fb = new FB(gb, lm);
        }
        Object objB = fb.e;
        MN mn = MN.d;
        int i2 = fb.h;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            InterfaceC1131Hh interfaceC1131Hh = gb.a;
            fb.d = captchaDestination;
            fb.h = 1;
            objB = interfaceC1131Hh.b();
            if (objB == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captchaDestination = fb.d;
            C1795Pt1.b(objB);
        }
        CommonCaptchaDestinationsResponse commonCaptchaDestinationsResponse = (CommonCaptchaDestinationsResponse) CommonResultKt.b((CommonResult) objB);
        if (commonCaptchaDestinationsResponse == null) {
            if ((captchaDestination instanceof CaptchaDestination.Login) || (captchaDestination instanceof CaptchaDestination.Registration)) {
                return EnumC1886Qy.CONFIG_FAILED_SKIPPED;
            }
            if ((captchaDestination instanceof CaptchaDestination.RemindPass) || (captchaDestination instanceof CaptchaDestination.SmsSend)) {
                return EnumC1886Qy.CONFIG_FAILED;
            }
            throw new C6489s51();
        }
        Iterator<T> it = commonCaptchaDestinationsResponse.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (captchaDestination.getClass() != ((CaptchaDestination) next).getClass());
        CaptchaDestination captchaDestination2 = (CaptchaDestination) next;
        return captchaDestination2 != null ? captchaDestination2.getIsCaptchaRequired() : false ? EnumC1886Qy.REQUIRED : EnumC1886Qy.NOT_REQUIRED;
    }

    @Override // defpackage.EB
    @Nullable
    public final Enum a(@NotNull CaptchaDestination captchaDestination, @NotNull C1652Ny c1652Ny) {
        return b(this, captchaDestination, c1652Ny);
    }
}
