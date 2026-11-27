package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4632jF1 implements InterfaceC4374iF1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final C1699On1 c;

    /* JADX INFO: renamed from: jF1$a */
    @InterfaceC3368dU(c = "com.impl.feature.registration.providers.SelectedAccountProviderImpl$1", f = "SelectedAccountProviderImpl.kt", l = {22}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: jF1$a$a, reason: collision with other inner class name */
        public static final class C0412a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4632jF1 d;

            public C0412a(C4632jF1 c4632jF1) {
                this.d = c4632jF1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                GP1 gp1 = this.d.b;
                Boolean bool = Boolean.FALSE;
                gp1.getClass();
                gp1.m(null, bool);
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4632jF1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            C4632jF1 c4632jF1 = C4632jF1.this;
            C6120qK1 c6120qK1 = c4632jF1.a.v;
            C0412a c0412a = new C0412a(c4632jF1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, c0412a, this);
            return mn;
        }
    }

    public C4632jF1(@NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = appDataRepository;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.b = gp1I;
        this.c = C4466ii.f(gp1I);
        C5189lv.k(C3784fT.a, null, new a(null), 3);
    }

    @Override // defpackage.InterfaceC4374iF1
    @NotNull
    public final C1699On1 a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC4374iF1
    public final void b() {
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.b;
        gp1.getClass();
        gp1.m(null, bool);
    }

    @Override // defpackage.InterfaceC4374iF1
    public final void c() {
        Boolean bool = Boolean.TRUE;
        GP1 gp1 = this.b;
        gp1.getClass();
        gp1.m(null, bool);
    }
}
