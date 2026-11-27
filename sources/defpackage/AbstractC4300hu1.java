package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4300hu1 extends AbstractC5982pg1<EnumC5843p10, Integer> {

    @NotNull
    public final KW1 b;

    /* JADX INFO: renamed from: hu1$a */
    public static final class a implements InterfaceC6396rf0<EnumC5843p10> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: hu1$a$a, reason: collision with other inner class name */
        public static final class C0369a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: hu1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStatePreferenceApi$value_delegate$lambda$2$$inlined$map$1$2", f = "ReviewDialogOpeningStatePreferenceApi.kt", l = {219}, m = "emit")
            public static final class C0370a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0370a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0369a.this.a(null, this);
                }
            }

            public C0369a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0046  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0370a c0370a;
                EnumC5843p10 enumC5843p10;
                if (jm instanceof C0370a) {
                    c0370a = (C0370a) jm;
                    int i = c0370a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0370a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0370a = new C0370a(jm);
                    }
                } else {
                    c0370a = new C0370a(jm);
                }
                Object obj2 = c0370a.d;
                MN mn = MN.d;
                int i2 = c0370a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Integer num = (Integer) obj;
                    if (num != null) {
                        enumC5843p10 = (EnumC5843p10) C1526Mj.t(EnumC5843p10.values(), num.intValue());
                        if (enumC5843p10 == null) {
                            enumC5843p10 = EnumC5843p10.PENDING;
                        }
                    } else {
                        enumC5843p10 = EnumC5843p10.PENDING;
                    }
                    c0370a.e = 1;
                    if (this.d.a(enumC5843p10, c0370a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super EnumC5843p10> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0369a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4300hu1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.b = XO0.b(new C4935ki(1, this, preferencesRepository));
    }
}
