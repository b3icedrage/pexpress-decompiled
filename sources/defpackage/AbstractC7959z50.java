package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7959z50 extends M50 {

    @NotNull
    public final C1273Jc0 n;

    @NotNull
    public final GP1 o;

    @NotNull
    public final C1699On1 p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final C1699On1 r;

    @NotNull
    public final b s;

    @NotNull
    public final InterfaceC6396rf0<Boolean> t;

    /* JADX INFO: renamed from: z50$a */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordViewModel$isActionButtonDisabled$1", f = "EmailAndPasswordViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<Boolean, String, AbstractC0961Fc0, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ String e;
        public /* synthetic */ AbstractC0961Fc0 g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d || this.e.length() == 0 || !Intrinsics.a(this.g, Jc2.a));
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(Boolean bool, String str, AbstractC0961Fc0 abstractC0961Fc0, JM<? super Boolean> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(4, jm);
            aVar.d = zBooleanValue;
            aVar.e = str;
            aVar.g = abstractC0961Fc0;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: z50$b */
    public static final class b implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C1699On1 d;

        /* JADX INFO: renamed from: z50$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: z50$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordViewModel$special$$inlined$map$1$2", f = "EmailAndPasswordViewModel.kt", l = {219}, m = "emit")
            public static final class C0547a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0547a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0547a c0547a;
                if (jm instanceof C0547a) {
                    c0547a = (C0547a) jm;
                    int i = c0547a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0547a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0547a = new C0547a(jm);
                    }
                } else {
                    c0547a = new C0547a(jm);
                }
                Object obj2 = c0547a.d;
                MN mn = MN.d;
                int i2 = c0547a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((String) obj).length() > 0);
                    c0547a.e = 1;
                    if (this.d.a(boolValueOf, c0547a) == mn) {
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

        public b(C1699On1 c1699On1) {
            this.d = c1699On1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7959z50(@NotNull C1273Jc0 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase) {
        super(emailValidationUseCase);
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        this.n = passwordValidationUseCase;
        GP1 gp1I = C1589Ne.i(Jc2.a);
        this.o = gp1I;
        C1699On1 c1699On1F = C4466ii.f(gp1I);
        this.p = c1699On1F;
        GP1 gp1I2 = C1589Ne.i("");
        this.q = gp1I2;
        C1699On1 c1699On1F2 = C4466ii.f(gp1I2);
        this.r = c1699On1F2;
        this.s = new b(c1699On1F2);
        this.t = C4466ii.m(C4466ii.k(this.m, c1699On1F2, c1699On1F, new a(4, null)));
    }

    @Override // defpackage.M50
    @NotNull
    public final InterfaceC6396rf0<Boolean> l() {
        return this.t;
    }

    public void o() {
        GP1 gp1 = this.g;
        gp1.getClass();
        gp1.m(null, "");
        GP1 gp2 = this.q;
        gp2.getClass();
        gp2.m(null, "");
    }
}
