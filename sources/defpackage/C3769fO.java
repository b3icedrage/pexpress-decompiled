package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3769fO implements InterfaceC3350dO {

    @NotNull
    public final RL0 a;

    @NotNull
    public final C4612j90 b;

    @NotNull
    public final InterfaceC1131Hh c;

    @NotNull
    public final C4923kf d;

    /* JADX INFO: renamed from: fO$a */
    @InterfaceC3368dU(c = "com.base.feature.account.usecases.CountryListPreloadUseCaseBase$preloadCountryList$1", f = "CountryListPreloadUseCaseBase.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 22}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: fO$a$a, reason: collision with other inner class name */
        public static final class C0351a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C3769fO d;

            public C0351a(C3769fO c3769fO) {
                this.d = c3769fO;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objB = C3769fO.b(this.d, jm);
                return objB == MN.d ? objB : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C3769fO.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r6.d.c(r1, r5) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.d
                fO r2 = defpackage.C3769fO.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 == r3) goto L16
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L16:
                defpackage.C1795Pt1.b(r6)
                goto L3e
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L2a
            L1e:
                defpackage.C1795Pt1.b(r6)
                r5.d = r4
                java.lang.Object r6 = defpackage.C3769fO.b(r2, r5)
                if (r6 != r0) goto L2a
                goto L3d
            L2a:
                j90 r6 = r2.b
                Nn1 r6 = r6.E
                fO$a$a r1 = new fO$a$a
                r1.<init>(r2)
                r5.d = r3
                e21 r6 = r6.d
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3e
            L3d:
                return r0
            L3e:
                dL0 r6 = new dL0
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3769fO.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3769fO(@NotNull RL0 languageList, @NotNull C4612j90 eventsFlowsProvider, @NotNull InterfaceC1131Hh appRepository, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = languageList;
        this.b = eventsFlowsProvider;
        this.c = appRepository;
        this.d = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C3769fO c3769fO, JM jm) {
        C3559eO c3559eO;
        c3769fO.getClass();
        if (jm instanceof C3559eO) {
            c3559eO = (C3559eO) jm;
            int i = c3559eO.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3559eO.h = i - Integer.MIN_VALUE;
            } else {
                c3559eO = new C3559eO(c3769fO, jm);
            }
        } else {
            c3559eO = new C3559eO(c3769fO, jm);
        }
        Object objJ = c3559eO.e;
        MN mn = MN.d;
        int i2 = c3559eO.h;
        if (i2 == 0) {
            C1795Pt1.b(objJ);
            String str = c3769fO.a.defaultValue().g;
            c3559eO.d = c3769fO;
            c3559eO.h = 1;
            objJ = c3769fO.c.j(str, c3559eO);
            if (objJ == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3769fO = c3559eO.d;
            C1795Pt1.b(objJ);
        }
        CommonResult commonResult = (CommonResult) objJ;
        if (commonResult instanceof ResultOk) {
            c3769fO.d.j.setValue(((ResultOk) commonResult).a());
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3350dO
    public final void a() {
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }
}
