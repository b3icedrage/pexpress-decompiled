package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Y61 extends X61 {

    @NotNull
    public final InterfaceC1442Lg1 b;

    @NotNull
    public final a c;

    @NotNull
    public final AbstractC0662Bg1.a<String> d;

    public static final class a implements InterfaceC6396rf0<W61> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: Y61$a$a, reason: collision with other inner class name */
        public static final class C0199a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Y61$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationsAvailabilityCachedValueUseCaseBase$special$$inlined$map$1$2", f = "NotificationsAvailabilityCachedValueUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0200a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0200a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0199a.this.a(null, this);
                }
            }

            public C0199a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0200a c0200a;
                if (jm instanceof C0200a) {
                    c0200a = (C0200a) jm;
                    int i = c0200a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0200a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0200a = new C0200a(jm);
                    }
                } else {
                    c0200a = new C0200a(jm);
                }
                Object obj2 = c0200a.d;
                MN mn = MN.d;
                int i2 = c0200a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    W61 w61ValueOf = W61.valueOf((String) obj);
                    c0200a.e = 1;
                    if (this.d.a(w61ValueOf, c0200a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super W61> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0199a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y61(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.b = preferencesRepository;
        Intrinsics.checkNotNullParameter(preferencesRepository, "<this>");
        this.c = new a(preferencesRepository.d(this, "NONE"));
        this.d = C1052Gg1.d("NOTIFICATIONS_AVAILABILITY_CACHED_VALUE");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.d;
    }
}
