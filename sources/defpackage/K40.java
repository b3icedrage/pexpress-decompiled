package defpackage;

import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class K40 extends C7576xG {

    @NotNull
    public final InterfaceC1767Pk0 d;

    @NotNull
    public final InterfaceC6065q40 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final C1699On1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final C1699On1 i;

    @NotNull
    public final a j;

    @NotNull
    public final InterfaceC6396rf0<DuoAuthType> k;

    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: K40$a$a, reason: collision with other inner class name */
        public static final class C0070a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: K40$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthViewModelBase$special$$inlined$map$1$2", f = "DuoAuthViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0071a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0071a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0070a.this.a(null, this);
                }
            }

            public C0070a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0071a c0071a;
                if (jm instanceof C0071a) {
                    c0071a = (C0071a) jm;
                    int i = c0071a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0071a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0071a = new C0071a(jm);
                    }
                } else {
                    c0071a = new C0071a(jm);
                }
                Object obj2 = c0071a.d;
                MN mn = MN.d;
                int i2 = c0071a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((String) obj).length() == 0);
                    c0071a.e = 1;
                    if (this.d.a(boolValueOf, c0071a) == mn) {
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

        public a(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0070a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public K40(@NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull InterfaceC6065q40 duoAuthCallbacks) {
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(duoAuthCallbacks, "duoAuthCallbacks");
        this.d = getCodeIfNeededFromDuoAuthUseCase;
        this.e = duoAuthCallbacks;
        GP1 gp1I = C1589Ne.i("");
        this.f = gp1I;
        this.g = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(Boolean.FALSE);
        this.h = gp1I2;
        this.i = C4466ii.f(gp1I2);
        this.j = new a(gp1I);
        this.k = getCodeIfNeededFromDuoAuthUseCase.a();
    }
}
