package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1787Pr extends AbstractC5982pg1<b, Integer> {

    @NotNull
    public final a b;

    /* JADX INFO: renamed from: Pr$a */
    public static final class a implements InterfaceC6396rf0<b> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: Pr$a$a, reason: collision with other inner class name */
        public static final class C0120a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Pr$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.usecases.BetDurationUseCaseApi$special$$inlined$map$1$2", f = "BetDurationUseCaseApi.kt", l = {219}, m = "emit")
            public static final class C0121a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0121a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0120a.this.a(null, this);
                }
            }

            public C0120a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0121a c0121a;
                if (jm instanceof C0121a) {
                    c0121a = (C0121a) jm;
                    int i = c0121a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0121a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0121a = new C0121a(jm);
                    }
                } else {
                    c0121a = new C0121a(jm);
                }
                Object obj2 = c0121a.d;
                MN mn = MN.d;
                int i2 = c0121a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    int iIntValue = ((Number) obj).intValue();
                    b.a aVar = b.e;
                    b bVar = new b(c.g(iIntValue, R40.SECONDS));
                    c0121a.e = 1;
                    if (this.d.a(bVar, c0121a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super b> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0120a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1787Pr(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "<this>");
        this.b = new a(preferencesRepository.d(this, 60));
    }
}
