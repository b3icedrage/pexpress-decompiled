package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3314dC extends AbstractC3104cC {

    @NotNull
    public final a d;

    @NotNull
    public final C1699On1 e;

    @NotNull
    public final String f;

    @NotNull
    public final AbstractC0662Bg1.a<String> g;

    /* JADX INFO: renamed from: dC$a */
    public static final class a implements InterfaceC6396rf0<String> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ C3314dC e;

        /* JADX INFO: renamed from: dC$a$a, reason: collision with other inner class name */
        public static final class C0337a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C3314dC e;

            /* JADX INFO: renamed from: dC$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.core.backend.providers.CiSessionProviderImpl$special$$inlined$map$1$2", f = "CiSessionProviderImpl.kt", l = {219}, m = "emit")
            public static final class C0338a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0338a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0337a.this.a(null, this);
                }
            }

            public C0337a(InterfaceC6606sf0 interfaceC6606sf0, C3314dC c3314dC) {
                this.d = interfaceC6606sf0;
                this.e = c3314dC;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0338a c0338a;
                String strSubstring;
                if (jm instanceof C0338a) {
                    c0338a = (C0338a) jm;
                    int i = c0338a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0338a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0338a = new C0338a(jm);
                    }
                } else {
                    c0338a = new C0338a(jm);
                }
                Object obj2 = c0338a.d;
                MN mn = MN.d;
                int i2 = c0338a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    try {
                        strSubstring = ((String) obj).substring(29, 61);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    } catch (Exception unused) {
                        strSubstring = this.e.f;
                    }
                    c0338a.e = 1;
                    if (this.d.a(strSubstring, c0338a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0, C3314dC c3314dC) {
            this.d = interfaceC6396rf0;
            this.e = c3314dC;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0337a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3314dC(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = new a(l(), this);
        this.e = C4466ii.E(l(), C3784fT.a, IK1.a.a, null);
        this.f = "";
        this.g = C1052Gg1.d("CI_SESSION_POCKET");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.g;
    }

    @Override // defpackage.AbstractC8082zg1
    public final String k() {
        return this.f;
    }

    @Override // defpackage.AbstractC3104cC
    @NotNull
    public final a n() {
        return this.d;
    }

    @Override // defpackage.AbstractC3104cC
    @NotNull
    public final C1699On1 o() {
        return this.e;
    }
}
