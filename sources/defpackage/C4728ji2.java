package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ji2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4728ji2 implements InterfaceC0735Cf {

    @NotNull
    public final InterfaceC2773ah1 a;

    @NotNull
    public final O3 b;

    @NotNull
    public final AbstractC2167Un1 c;

    @NotNull
    public final C4923kf d;

    @NotNull
    public final Pa2 e;

    @NotNull
    public final Context f;

    @NotNull
    public final InterfaceC4399iO g;

    @NotNull
    public final InterfaceC3985gQ h;

    @NotNull
    public String i;

    /* JADX INFO: renamed from: ji2$a */
    @InterfaceC3368dU(c = "com.base.feature.platform.utils.WebViewPreloadingUpdater$stop$1", f = "WebViewPreloadingUpdater.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4728ji2.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C4728ji2 c4728ji2 = C4728ji2.this;
            c4728ji2.i = "";
            c4728ji2.a.i();
            return Unit.a;
        }
    }

    public C4728ji2(@NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC2167Un1 realAccountIdUseCase, @NotNull C4923kf appData, @NotNull Pa2 urlsProvider, @NotNull Context context, @NotNull InterfaceC4399iO couponProvider, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(realAccountIdUseCase, "realAccountIdUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(couponProvider, "couponProvider");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        this.a = preloadedWebViewUseCase;
        this.b = accountModeSelectionUseCase;
        this.c = realAccountIdUseCase;
        this.d = appData;
        this.e = urlsProvider;
        this.f = context;
        this.g = couponProvider;
        this.h = cryptoEnablementProvider;
        this.i = "";
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf updater) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        return InterfaceC0735Cf.a.a(this, updater);
    }

    @Override // defpackage.InterfaceC0735Cf
    @Nullable
    public final Object b(@NotNull LM lm) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new C4469ii2(this, null), lm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
        if (this.d.f.getValue() != null) {
            return;
        }
        EM em = C3784fT.a;
        RV rv = C6266r20.a;
        C5189lv.k(em, QV0.a, new a(null), 2);
    }
}
