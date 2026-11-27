package defpackage;

import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5543nb2 implements InterfaceC6353rS1 {

    @NotNull
    public final ZT1 a;

    @NotNull
    public final AbstractC3947gD0 b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final InterfaceC6396rf0<String> d;

    /* JADX INFO: renamed from: nb2$a */
    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.UserLookupSessionValue$valueFlow$1", f = "UserLookupSessionValue.kt", l = {47, 53, 57}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC1133Hh1<? super String>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        /* JADX INFO: renamed from: nb2$a$a, reason: collision with other inner class name */
        public static final class C0448a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC1133Hh1<String> d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0448a(InterfaceC1133Hh1<? super String> interfaceC1133Hh1) {
                this.d = interfaceC1133Hh1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM<? super Unit> jm) {
                Object objJ = this.d.j(jm, FK.c(obj, "https://app.amplitude.com/analytics/tradematix/users?searchType=search&search="));
                return objJ == MN.d ? objJ : Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = C5543nb2.this.new a(jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1133Hh1<? super String> interfaceC1133Hh1, JM<? super Unit> jm) {
            return ((a) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        
            if (r10 == r2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        
            if (r3.j(r9, "user_lookup: Amplitude is not initialized") == r2) goto L28;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                r0 = 1
                r1 = 2
                MN r2 = defpackage.MN.d
                int r3 = r9.d
                nb2 r4 = defpackage.C5543nb2.this
                r5 = 3
                if (r3 == 0) goto L26
                if (r3 == r0) goto L1e
                if (r3 == r1) goto L1a
                if (r3 != r5) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                defpackage.C1795Pt1.b(r10)
                goto L89
            L1e:
                java.lang.Object r3 = r9.e
                Hh1 r3 = (defpackage.InterfaceC1133Hh1) r3
                defpackage.C1795Pt1.b(r10)
                goto L3b
            L26:
                defpackage.C1795Pt1.b(r10)
                java.lang.Object r10 = r9.e
                r3 = r10
                Hh1 r3 = (defpackage.InterfaceC1133Hh1) r3
                gD0 r10 = r4.b
                r9.e = r3
                r9.d = r0
                java.lang.Object r10 = r10.n(r9)
                if (r10 != r2) goto L3b
                goto L88
            L3b:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                r6 = 0
                if (r10 == 0) goto L7c
                kf r10 = r4.c
                GP1 r7 = r10.d
                mb2 r8 = new mb2
                r8.<init>(r5, r6)
                nb2$a$a r5 = new nb2$a$a
                r5.<init>(r3)
                r9.e = r6
                r9.d = r1
                ob2 r3 = new ob2
                r3.<init>(r5, r4)
                GP1 r10 = r10.e
                rf0[] r1 = new defpackage.InterfaceC6396rf0[r1]
                r4 = 0
                r1[r4] = r7
                r1[r0] = r10
                tg0 r10 = new tg0
                r10.<init>(r8, r6)
                vg0 r0 = defpackage.C7240vg0.d
                java.lang.Object r10 = defpackage.C4372iF.a(r9, r3, r10, r0, r1)
                if (r10 != r2) goto L72
                goto L74
            L72:
                kotlin.Unit r10 = kotlin.Unit.a
            L74:
                if (r10 != r2) goto L77
                goto L79
            L77:
                kotlin.Unit r10 = kotlin.Unit.a
            L79:
                if (r10 != r2) goto L89
                goto L88
            L7c:
                r9.e = r6
                r9.d = r5
                java.lang.String r10 = "user_lookup: Amplitude is not initialized"
                java.lang.Object r10 = r3.j(r9, r10)
                if (r10 != r2) goto L89
            L88:
                return r2
            L89:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5543nb2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5543nb2(@NotNull ZT1 subIdProvider, @NotNull AbstractC3947gD0 isAmplitudeInitializedUseCaseApi, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(isAmplitudeInitializedUseCaseApi, "isAmplitudeInitializedUseCaseApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = subIdProvider;
        this.b = isAmplitudeInitializedUseCaseApi;
        this.c = appDataRepository;
        this.d = C4466ii.m(new C2201Uz(new a(null), e.d, -2, EnumC1796Pu.d));
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.d;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return EnumC2694aJ1.USER_LOOKUP;
    }
}
