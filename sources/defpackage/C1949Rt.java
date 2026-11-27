package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1949Rt {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final BottomNavigationView c;

    @NotNull
    public final C4250hg0 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final KW1 f;

    @NotNull
    public final AbstractC5045lD0 g;

    @Nullable
    public C0667Bi0 h;

    /* JADX INFO: renamed from: Rt$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1793Pt.values().length];
            try {
                EnumC1793Pt enumC1793Pt = EnumC1793Pt.Platform;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC1793Pt enumC1793Pt2 = EnumC1793Pt.Platform;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC1793Pt enumC1793Pt3 = EnumC1793Pt.Platform;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC1793Pt enumC1793Pt4 = EnumC1793Pt.Platform;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: Rt$b */
    @InterfaceC3368dU(c = "com.base.feature.navigation.BottomNavigationListenerImpl", f = "BottomNavigationListenerImpl.kt", l = {62}, m = "invalidateState")
    public static final class b extends LM {
        public C1949Rt d;
        public /* synthetic */ Object e;
        public int h;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C1949Rt.this.b(this);
        }
    }

    public C1949Rt(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull BottomNavigationView bottomNavigationView, @NotNull C4250hg0 navigationStateFlow, @NotNull ReporterApi reporter, @NotNull KW1 shouldSendAccountTransitionEvent, @NotNull AbstractC5045lD0 isShowUseCaseApi) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(navigationStateFlow, "navigationStateFlow");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(shouldSendAccountTransitionEvent, "shouldSendAccountTransitionEvent");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        this.a = router;
        this.b = screensProvider;
        this.c = bottomNavigationView;
        this.d = navigationStateFlow;
        this.e = reporter;
        this.f = shouldSendAccountTransitionEvent;
        this.g = isShowUseCaseApi;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LM lm) {
        C2027St c2027St;
        C1949Rt c1949Rt;
        C1949Rt c1949Rt2;
        if (lm instanceof C2027St) {
            c2027St = (C2027St) lm;
            int i = c2027St.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2027St.h = i - Integer.MIN_VALUE;
            } else {
                c2027St = new C2027St(this, lm);
            }
        } else {
            c2027St = new C2027St(this, lm);
        }
        Object objN = c2027St.e;
        MN mn = MN.d;
        int i2 = c2027St.h;
        if (i2 == 0) {
            C1795Pt1.b(objN);
            c2027St.d = this;
            c2027St.h = 1;
            objN = this.g.n(c2027St);
            if (objN != mn) {
                c1949Rt = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c1949Rt = c2027St.d;
            C1795Pt1.b(objN);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1949Rt2 = c2027St.d;
            C1795Pt1.b(objN);
        }
        if (!((Boolean) objN).booleanValue()) {
            c1949Rt2.c.getMenu().findItem(R.id.main_platform_fragment).setVisible(false);
            c1949Rt2.c.setSelectedItemId(R.id.main_robot_fragment);
        }
        return Unit.a;
        c2027St.d = c1949Rt;
        c2027St.h = 2;
        objN = C4466ii.o((InterfaceC6396rf0) objN, c2027St);
        if (objN != mn) {
            c1949Rt2 = c1949Rt;
            if (!((Boolean) objN).booleanValue()) {
                c1949Rt2.c.getMenu().findItem(R.id.main_platform_fragment).setVisible(false);
                c1949Rt2.c.setSelectedItemId(R.id.main_robot_fragment);
            }
            return Unit.a;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull JM<? super Unit> jm) {
        b bVar;
        C1949Rt c1949Rt;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.h = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object objO = bVar.e;
        MN mn = MN.d;
        int i2 = bVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            bVar.d = this;
            bVar.h = 1;
            objO = C4466ii.o(this.d, bVar);
            if (objO == mn) {
                return mn;
            }
            c1949Rt = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1949Rt = bVar.d;
            C1795Pt1.b(objO);
        }
        C0667Bi0 c0667Bi0 = (C0667Bi0) objO;
        c1949Rt.h = c0667Bi0;
        if (c0667Bi0.e) {
            InterfaceC3951gE1 interfaceC3951gE1 = c1949Rt.b;
            if (c0667Bi0.equals(interfaceC3951gE1.k())) {
                c1949Rt.c(EnumC1793Pt.Platform);
            } else if (c0667Bi0.equals(interfaceC3951gE1.a())) {
                c1949Rt.c(EnumC1793Pt.Robot);
            } else if (c0667Bi0.equals(interfaceC3951gE1.n())) {
                c1949Rt.c(EnumC1793Pt.Account);
            } else if (c0667Bi0.equals(interfaceC3951gE1.h())) {
                c1949Rt.c(EnumC1793Pt.Support);
            } else if (c0667Bi0.equals(interfaceC3951gE1.o())) {
                c1949Rt.c(EnumC1793Pt.Platform);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(EnumC1793Pt enumC1793Pt) {
        EnumC5028l80 enumC5028l80;
        T t;
        C3027bp1 c3027bp1 = new C3027bp1();
        BottomNavigationView bottomNavigationView = this.c;
        Menu menu = bottomNavigationView.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        C4691jZ0 c4691jZ0 = new C4691jZ0(menu);
        while (true) {
            enumC5028l80 = null;
            T t2 = 0;
            enumC5028l80 = null;
            if (!c4691jZ0.hasNext()) {
                break;
            }
            MenuItem menuItem = (MenuItem) c4691jZ0.next();
            if (menuItem.isChecked()) {
                C4814k70 c4814k70 = EnumC1793Pt.k;
                c4814k70.getClass();
                AbstractC5838p0.b bVar = new AbstractC5838p0.b();
                while (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (((EnumC1793Pt) next).d == menuItem.getItemId()) {
                        t2 = next;
                        break;
                    }
                }
                c3027bp1.d = t2;
            }
        }
        Menu menu2 = bottomNavigationView.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu2, "getMenu(...)");
        C4691jZ0 c4691jZ1 = new C4691jZ0(menu2);
        while (c4691jZ1.hasNext()) {
            ((MenuItem) c4691jZ1.next()).setChecked(false);
        }
        if (c3027bp1.d != null) {
            int i = a.a[enumC1793Pt.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    enumC5028l80 = EnumC5028l80.n0;
                } else if (i == 2) {
                    enumC5028l80 = EnumC5028l80.o0;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new C6489s51();
                    }
                    enumC5028l80 = EnumC5028l80.E0;
                }
            }
            if (enumC5028l80 != null && (t = c3027bp1.d) != enumC1793Pt) {
                Intrinsics.checkNotNull(t);
                ReporterApi.a.b(this.e, enumC5028l80, new C1510Md1(((EnumC1793Pt) t).name()), VE.c(EnumC5326ma.e), 8);
            }
        }
        bottomNavigationView.getMenu().findItem(enumC1793Pt.d).setChecked(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2.d.c(r6, r0) == r1) goto L22;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C2105Tt
            if (r0 == 0) goto L13
            r0 = r6
            Tt r0 = (defpackage.C2105Tt) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Tt r0 = new Tt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Rt r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L47
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L46
            goto L64
        L46:
            r2 = r5
        L47:
            com.google.android.material.bottomnavigation.BottomNavigationView r6 = r2.c
            yl r4 = new yl
            r4.<init>(r2)
            r6.setOnItemSelectedListener(r4)
            Ut r6 = new Ut
            r4 = 0
            r6.<init>(r2, r4)
            r4 = 0
            r0.d = r4
            r0.h = r3
            hg0 r2 = r2.d
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1949Rt.d(LM):java.lang.Object");
    }
}
