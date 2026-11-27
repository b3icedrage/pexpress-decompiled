package defpackage;

import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Li2 extends AbstractC8082zg1<String> implements Ki2 {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final O3 e;

    @NotNull
    public final C5829ox0 f;

    @NotNull
    public final Gson g;

    @NotNull
    public final String h;

    @NotNull
    public final AbstractC0662Bg1.a<String> i;

    @NotNull
    public final b j;

    public final class a {
        public final int a;

        @Nullable
        public final Boolean b;

        public a(Li2 li2, @Nullable int i, Boolean bool) {
            this.a = i;
            this.b = bool;
        }
    }

    public static final class b implements InterfaceC6396rf0<Integer> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ Li2 e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ Li2 e;

            /* JADX INFO: renamed from: Li2$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.WinCounterForAppReviewProviderBase$special$$inlined$map$1$2", f = "WinCounterForAppReviewProviderBase.kt", l = {219}, m = "emit")
            public static final class C0087a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0087a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0, Li2 li2) {
                this.d = interfaceC6606sf0;
                this.e = li2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0087a c0087a;
                if (jm instanceof C0087a) {
                    c0087a = (C0087a) jm;
                    int i = c0087a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0087a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0087a = new C0087a(jm);
                    }
                } else {
                    c0087a = new C0087a(jm);
                }
                Object obj2 = c0087a.d;
                MN mn = MN.d;
                int i2 = c0087a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Object objD = this.e.g.d(a.class, (String) obj);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    Integer num = new Integer(((a) objD).a);
                    c0087a.e = 1;
                    if (this.d.a(num, c0087a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(InterfaceC6396rf0 interfaceC6396rf0, Li2 li2) {
            this.d = interfaceC6396rf0;
            this.e = li2;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Integer> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Li2(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull C4923kf appData, @NotNull O3 accountModeSelectionUseCase, @NotNull C5829ox0 inAppReviewLocalExperiment) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(inAppReviewLocalExperiment, "inAppReviewLocalExperiment");
        this.d = appData;
        this.e = accountModeSelectionUseCase;
        this.f = inAppReviewLocalExperiment;
        Gson gson = new Gson();
        this.g = gson;
        String strI = gson.i(new a(this, 0, null));
        Intrinsics.checkNotNullExpressionValue(strI, "toJson(...)");
        this.h = strI;
        this.i = C1052Gg1.d("IN_APP_DIALOG_WIN_COUNTER");
        this.j = new b(l(), this);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[PHI: r7
      0x00a4: PHI (r7v2 Li2) = (r7v1 Li2), (r7v1 Li2), (r7v1 Li2), (r7v3 Li2) binds: [B:24:0x0071, B:25:0x0073, B:27:0x007d, B:32:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.Ki2
    @Nullable
    public final Object c(boolean z, @NotNull LM lm) {
        Mi2 mi2;
        Li2 li2;
        Li2 li3;
        Li2 li4;
        Object objO;
        if (lm instanceof Mi2) {
            mi2 = (Mi2) lm;
            int i = mi2.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi2.j = i - Integer.MIN_VALUE;
            } else {
                mi2 = new Mi2(this, lm);
            }
        } else {
            mi2 = new Mi2(this, lm);
        }
        Object objO2 = mi2.h;
        MN mn = MN.d;
        int i2 = mi2.j;
        if (i2 == 0) {
            C1795Pt1.b(objO2);
            InterfaceC6396rf0<String> interfaceC6396rf0L = l();
            mi2.d = this;
            mi2.e = this;
            mi2.g = z;
            mi2.j = 1;
            objO2 = C4466ii.o(interfaceC6396rf0L, mi2);
            if (objO2 != mn) {
                li2 = this;
                li3 = li2;
            }
            return mn;
        }
        if (i2 == 1) {
            z = mi2.g;
            li2 = mi2.e;
            li3 = mi2.d;
            C1795Pt1.b(objO2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objO2);
                return objO2;
            }
            li4 = mi2.d;
            C1795Pt1.b(objO2);
        }
        li3 = li4;
        b bVar = li3.j;
        mi2.d = null;
        mi2.e = null;
        mi2.j = 3;
        objO = C4466ii.o(bVar, mi2);
        if (objO != mn) {
            return mn;
        }
        return objO;
        Object objD = li2.g.d(a.class, (String) objO2);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        a aVar = (a) objD;
        if (aVar.a == 1 && z) {
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.a(aVar.b, bool)) {
                b bVar2 = li3.j;
                mi2.d = null;
                mi2.e = null;
                mi2.j = 3;
                objO = C4466ii.o(bVar2, mi2);
                if (objO != mn) {
                    return objO;
                }
            } else {
                String strI = li3.g.i(new a(li3, 0, bool));
                Intrinsics.checkNotNullExpressionValue(strI, "toJson(...)");
                Ni2 ni2 = new Ni2(strI, null);
                mi2.d = li3;
                mi2.e = null;
                mi2.j = 2;
                if (li3.m(ni2, mi2) != mn) {
                    li4 = li3;
                    li3 = li4;
                    b bVar3 = li3.j;
                    mi2.d = null;
                    mi2.e = null;
                    mi2.j = 3;
                    objO = C4466ii.o(bVar3, mi2);
                    if (objO != mn) {
                        return objO;
                    }
                }
            }
        } else {
            b bVar4 = li3.j;
            mi2.d = null;
            mi2.e = null;
            mi2.j = 3;
            objO = C4466ii.o(bVar4, mi2);
            if (objO != mn) {
                return objO;
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r4.m(r10, r0) == r1) goto L37;
     */
    @Override // defpackage.Ki2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r9, @org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Li2.h(boolean, LM):java.lang.Object");
    }

    @Override // defpackage.Ki2
    @NotNull
    public final b i() {
        return this.j;
    }

    @Override // defpackage.AbstractC8082zg1
    public final String k() {
        return this.h;
    }
}
