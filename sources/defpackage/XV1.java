package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XV1 extends C7576xG {

    @NotNull
    public final Pa2 d;

    @NotNull
    public final InterfaceC4890kV1 e;

    @NotNull
    public final InterfaceC6396rf0<List<C5053lG>> f;

    @NotNull
    public final InterfaceC6396rf0<List<C5266mG>> g;

    @NotNull
    public final a h;

    @NotNull
    public final b i;

    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: XV1$a$a, reason: collision with other inner class name */
        public static final class C0189a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: XV1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportQuestionAndCategoryViewModelBase$special$$inlined$map$1$2", f = "SupportQuestionAndCategoryViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0190a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0190a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0189a.this.a(null, this);
                }
            }

            public C0189a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0190a c0190a;
                if (jm instanceof C0190a) {
                    c0190a = (C0190a) jm;
                    int i = c0190a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0190a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0190a = new C0190a(jm);
                    }
                } else {
                    c0190a = new C0190a(jm);
                }
                Object obj2 = c0190a.d;
                MN mn = MN.d;
                int i2 = c0190a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).isEmpty());
                    c0190a.e = 1;
                    if (this.d.a(boolValueOf, c0190a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0189a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public static final class b implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: XV1$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportQuestionAndCategoryViewModelBase$special$$inlined$map$2$2", f = "SupportQuestionAndCategoryViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0191a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0191a(JM jm) {
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
                C0191a c0191a;
                if (jm instanceof C0191a) {
                    c0191a = (C0191a) jm;
                    int i = c0191a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0191a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0191a = new C0191a(jm);
                    }
                } else {
                    c0191a = new C0191a(jm);
                }
                Object obj2 = c0191a.d;
                MN mn = MN.d;
                int i2 = c0191a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).isEmpty());
                    c0191a.e = 1;
                    if (this.d.a(boolValueOf, c0191a) == mn) {
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

        public b(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public XV1(@NotNull Pa2 urlsProvider, @NotNull InterfaceC4234hc0 knowledgeBaseValuesUseCaseApi, @NotNull InterfaceC4890kV1 supportCallbacks) {
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(knowledgeBaseValuesUseCaseApi, "knowledgeBaseValuesUseCaseApi");
        Intrinsics.checkNotNullParameter(supportCallbacks, "supportCallbacks");
        this.d = urlsProvider;
        this.e = supportCallbacks;
        this.f = knowledgeBaseValuesUseCaseApi.c();
        this.g = knowledgeBaseValuesUseCaseApi.a();
        this.h = new a(knowledgeBaseValuesUseCaseApi.c());
        this.i = new b(knowledgeBaseValuesUseCaseApi.a());
    }

    public final void l(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.e.c(Z0.c(this.d.o(), url));
    }
}
