package defpackage;

import android.webkit.URLUtil;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6370rY0 implements InterfaceC5321mY0 {

    @NotNull
    public static final Pattern d;

    @NotNull
    public final InterfaceC4430iY0 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final YY0<String, AbstractC4688jY0> c;

    static {
        Pattern patternCompile = Pattern.compile("https://media.*\\.jivosite\\.com.*");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"https://media.*\\\\.jivosite\\\\.com.*\")");
        d = patternCompile;
    }

    public C6370rY0(@NotNull InterfaceC4430iY0 api, @NotNull InterfaceC5889pD1 schedulers) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = api;
        this.b = schedulers;
        this.c = new YY0<>();
    }

    @Override // defpackage.InterfaceC5321mY0
    @NotNull
    public final W11 a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        boolean zMatches = d.matcher(path).matches();
        YY0<String, AbstractC4688jY0> yy0 = this.c;
        if (!zMatches) {
            String strGuessFileName = URLUtil.guessFileName(path, null, null);
            Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(path, null, null)");
            return yy0.a(path, new AbstractC4688jY0.e(new C4220hY0(strGuessFileName, 12, path, false)));
        }
        W11 w11A = yy0.a(path, AbstractC4688jY0.c.a);
        if (w11A.d() instanceof AbstractC4688jY0.c) {
            InterfaceC5889pD1 interfaceC5889pD1 = this.b;
            AbstractC1776Pn0.a aVar = new AbstractC1776Pn0.a(interfaceC5889pD1);
            C5531nY0 call = new C5531nY0(this, path);
            Intrinsics.checkNotNullParameter(call, "call");
            aVar.b = call;
            C5741oY0 call2 = new C5741oY0(this, path);
            Intrinsics.checkNotNullParameter(call2, "call");
            aVar.c = call2;
            EY0<C3457dt1<R>> ey0 = new C1698On0(aVar, interfaceC5889pD1).a;
            Intrinsics.c(ey0, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.jivosite.sdk.network.resource.Resource<R of com.jivosite.sdk.network.resource.HeadResource>>");
            C0957Fb.s(ey0, new ZQ0(1, this, path));
        }
        return w11A;
    }
}
