package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Ra2 implements UB0 {

    @NotNull
    public final Context a;

    public Ra2(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.a = appContext;
    }

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1.a aVarB = chain.e.b();
        aVarB.f("User-Agent");
        aVarB.a("User-Agent", "JivoSDK-Android/2.1.0 (Mobile; Device=" + Build.MANUFACTURER + '/' + Build.MODEL + "; Platform=Android/" + Build.VERSION.RELEASE + ',' + Build.VERSION.SDK_INT + "; Host=" + this.a.getPackageName() + "; OkHttp=4.9.1)");
        return chain.b(aVarB.b());
    }
}
