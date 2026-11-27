package defpackage;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UX extends SX {

    @NotNull
    public final Activity b;

    @NotNull
    public final C5253mB1 c;

    @NotNull
    public final Y71 d;

    @NotNull
    public final InterfaceC3951gE1 e;

    @NotNull
    public final InterfaceC4315hz1 f;

    @NotNull
    public final InterfaceC2773ah1 g;

    @NotNull
    public final O3 h;

    @NotNull
    public final InterfaceC2152Ui1 i;
    public boolean j;

    @InterfaceC3368dU(c = "com.base.app.navigation.DepositNavigationManager", f = "DepositNavigationManager.kt", l = {51}, m = "onDepositCompleted")
    public static final class a extends LM {
        public UX d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return UX.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UX(@NotNull Activity activity, @NotNull C5253mB1 router, @NotNull Y71 navigator, @NotNull InterfaceC3951gE1 screensProvider, @NotNull C5335mc0 fewStepsStateProvider, @NotNull InterfaceC4315hz1 robotScreenStateProvider, @NotNull C4923kf appData, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull O3 accountModeSelectionUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase) {
        super(appData);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(fewStepsStateProvider, "fewStepsStateProvider");
        Intrinsics.checkNotNullParameter(robotScreenStateProvider, "robotScreenStateProvider");
        Intrinsics.checkNotNullParameter(appData, "appDataRepository");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.b = activity;
        this.c = router;
        this.d = navigator;
        this.e = screensProvider;
        this.f = robotScreenStateProvider;
        this.g = preloadedWebViewUseCase;
        this.h = accountModeSelectionUseCase;
        this.i = profitLimitUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) throws Throwable {
        TX tx;
        UX ux;
        UX ux2;
        if (lm instanceof TX) {
            tx = (TX) lm;
            int i = tx.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                tx.i = i - Integer.MIN_VALUE;
            } else {
                tx = new TX(this, lm);
            }
        } else {
            tx = new TX(this, lm);
        }
        Object objA = tx.g;
        MN mn = MN.d;
        int i2 = tx.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.a.c;
            tx.d = this;
            tx.e = this;
            tx.i = 1;
            objA = C7236vf0.a(gp1, tx);
            if (objA == mn) {
                return mn;
            }
            ux = this;
            ux2 = ux;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objA);
                return Unit.a;
            }
            ux = tx.e;
            ux2 = tx.d;
            C1795Pt1.b(objA);
        }
        ux.j = ((C6106qG) objA).d;
        tx.d = null;
        tx.e = null;
        tx.i = 2;
        ux2.getClass();
        SX.a(ux2, tx);
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull JM<? super Unit> jm) {
        a aVar;
        UX ux;
        FragmentManager supportFragmentManager;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            aVar.d = this;
            aVar.h = 1;
            Object objM = ((P3) this.h).m(new VX(this, null), aVar);
            if (objM != mn) {
                objM = Unit.a;
            }
            if (objM == mn) {
                return mn;
            }
            ux = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ux = aVar.d;
            C1795Pt1.b(obj);
        }
        String str = (String) ux.d.a().d.getValue();
        InterfaceC3951gE1 interfaceC3951gE1 = ux.e;
        boolean zA = Intrinsics.a(str, interfaceC3951gE1.v().b);
        C5253mB1 c5253mB1 = ux.c;
        if (zA) {
            if (!ux.j) {
                c5253mB1.b();
            }
            c5253mB1.b();
        } else if (Intrinsics.a(str, interfaceC3951gE1.E().b)) {
            c5253mB1.b();
        }
        ux.g.h();
        Activity activity = ux.b;
        g gVar = activity instanceof g ? (g) activity : null;
        if (gVar != null && (supportFragmentManager = gVar.getSupportFragmentManager()) != null && !supportFragmentManager.I) {
            c5253mB1.c(interfaceC3951gE1.a(), false);
        }
        ux.j = false;
        return Unit.a;
    }
}
