package defpackage;

import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845Qk0 implements InterfaceC1767Pk0 {

    @NotNull
    public final C6120qK1 a;

    @NotNull
    public final C1621Nn1 b;

    @NotNull
    public final a c;

    @NotNull
    public final C6120qK1 d;

    @NotNull
    public final C1621Nn1 e;

    /* JADX INFO: renamed from: Qk0$a */
    public static final class a implements InterfaceC6396rf0<DuoAuthType> {
        public final /* synthetic */ C1621Nn1 d;

        /* JADX INFO: renamed from: Qk0$a$a, reason: collision with other inner class name */
        public static final class C0133a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Qk0$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.library.registration.usecases.GetCodeIfNeededFromDuoAuthUseCaseBase$special$$inlined$filter$1$2", f = "GetCodeIfNeededFromDuoAuthUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0134a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0134a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0133a.this.a(null, this);
                }
            }

            public C0133a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0134a c0134a;
                if (jm instanceof C0134a) {
                    c0134a = (C0134a) jm;
                    int i = c0134a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0134a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0134a = new C0134a(jm);
                    }
                } else {
                    c0134a = new C0134a(jm);
                }
                Object obj2 = c0134a.d;
                MN mn = MN.d;
                int i2 = c0134a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((DuoAuthType) obj) != DuoAuthType.NONE) {
                        c0134a.e = 1;
                        if (this.d.a(obj, c0134a) == mn) {
                            return mn;
                        }
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

        public a(C1621Nn1 c1621Nn1) {
            this.d = c1621Nn1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super DuoAuthType> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new C0133a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C1845Qk0(@NotNull C4966kq1 registerAndLoginParams) {
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.a = c6120qK1G;
        C1621Nn1 c1621Nn1E = C4466ii.e(c6120qK1G);
        this.b = c1621Nn1E;
        this.c = new a(c1621Nn1E);
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.d = c6120qK1G2;
        this.e = C4466ii.e(c6120qK1G2);
    }

    @Override // defpackage.InterfaceC1767Pk0
    @NotNull
    public final a a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC1767Pk0
    @NotNull
    public final InterfaceC5910pK1<DuoAuthType> b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1767Pk0
    @NotNull
    public final C1621Nn1 c() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1767Pk0
    @Nullable
    public final Object d(@NotNull String str, @NotNull AW1 aw1) throws Throwable {
        Object objA = this.d.a(str, aw1);
        return objA == MN.d ? objA : Unit.a;
    }

    @Override // defpackage.InterfaceC1767Pk0
    @Nullable
    public final Object e(@NotNull DuoAuthType duoAuthType, @NotNull LM lm) throws Throwable {
        Object objA = this.a.a(duoAuthType, lm);
        return objA == MN.d ? objA : Unit.a;
    }
}
