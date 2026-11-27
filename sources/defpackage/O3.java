package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class O3 extends AbstractC5982pg1<EnumC4164hF1, Integer> {

    @NotNull
    public final KW1 b;

    public static final class a implements InterfaceC6396rf0<EnumC4164hF1> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: O3$a$a, reason: collision with other inner class name */
        public static final class C0106a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: O3$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.usecases.indicators.AccountModeSelectionUseCaseApi$value_delegate$lambda$1$$inlined$map$1$2", f = "AccountModeSelectionUseCaseApi.kt", l = {219}, m = "emit")
            public static final class C0107a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0107a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0106a.this.a(null, this);
                }
            }

            public C0106a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0107a c0107a;
                if (jm instanceof C0107a) {
                    c0107a = (C0107a) jm;
                    int i = c0107a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0107a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0107a = new C0107a(jm);
                    }
                } else {
                    c0107a = new C0107a(jm);
                }
                Object obj2 = c0107a.d;
                MN mn = MN.d;
                int i2 = c0107a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Integer num = (Integer) obj;
                    EnumC4164hF1 enumC4164hF1 = EnumC4164hF1.g;
                    if (num == null || num.intValue() != 1) {
                        EnumC4164hF1 enumC4164hF2 = EnumC4164hF1.h;
                        if (num != null && num.intValue() == 0) {
                            enumC4164hF1 = enumC4164hF2;
                        }
                    }
                    c0107a.e = 1;
                    if (this.d.a(enumC4164hF1, c0107a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super EnumC4164hF1> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0106a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.b = XO0.b(new N3(0, this, preferencesRepository));
    }

    @NotNull
    public final InterfaceC6396rf0<EnumC4164hF1> k() {
        return (InterfaceC6396rf0) this.b.getValue();
    }

    @NotNull
    public abstract C1699On1 l();
}
