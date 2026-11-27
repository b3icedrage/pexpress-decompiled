package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsRequest;
import com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsResponse;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: va0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7216va0 {

    @NotNull
    public final InterfaceC0799Da0 a;

    @NotNull
    public final ReporterApi b;

    public AbstractC7216va0(@NotNull InterfaceC0799Da0 experimentsRepository, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(experimentsRepository, "experimentsRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = experimentsRepository;
        this.b = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(K0 k0, ZT1 zt1, Context context, String str, LM lm) {
        C7006ua0 c7006ua0;
        if (lm instanceof C7006ua0) {
            c7006ua0 = (C7006ua0) lm;
            int i = c7006ua0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7006ua0.j = i - Integer.MIN_VALUE;
            } else {
                c7006ua0 = new C7006ua0(k0, lm);
            }
        } else {
            c7006ua0 = new C7006ua0(k0, lm);
        }
        Object objA = c7006ua0.h;
        MN mn = MN.d;
        int i2 = c7006ua0.j;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c7006ua0.d = zt1;
            c7006ua0.e = context;
            c7006ua0.g = str;
            c7006ua0.j = 1;
            objA = zt1.a(c7006ua0);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c7006ua0.g;
            context = c7006ua0.e;
            zt1 = c7006ua0.d;
            C1795Pt1.b(objA);
        }
        String str2 = (String) objA;
        String strB = zt1.b();
        Object systemService = C6333rM.getSystemService(context, TelephonyManager.class);
        if (systemService == null) {
            throw new IllegalStateException("The class is not a supported system service.");
        }
        String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
        Intrinsics.checkNotNullExpressionValue(simCountryIso, "getSimCountryIso(...)");
        return new TestingFeaturesParamsRequest(str2, strB, simCountryIso, str);
    }

    @Nullable
    public Object d(@NotNull TestingFeaturesParamsRequest testingFeaturesParamsRequest, @NotNull JM<? super CommonResult<TestingFeaturesParamsResponse>> jm) {
        return this.a.a();
    }
}
