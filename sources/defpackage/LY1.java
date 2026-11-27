package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LY1 {

    @InterfaceC3368dU(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyBlocking$1", f = "ThreadUtils.kt", l = {33}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super JM<? super Unit>, ? extends Object> function1, JM<? super a> jm) {
            super(2, jm);
            this.$block = function1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.$block, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                Function1<JM<? super Unit>, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function0<Unit> {
        final /* synthetic */ Function1<JM<? super Unit>, Object> $block;

        @InterfaceC3368dU(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1", f = "ThreadUtils.kt", l = {47}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
            int label;

            /* JADX INFO: renamed from: LY1$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1$1", f = "ThreadUtils.kt", l = {48}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
            public static final class C0086a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0086a(Function1<? super JM<? super Unit>, ? extends Object> function1, JM<? super C0086a> jm) {
                    super(2, jm);
                    this.$block = function1;
                }

                @Override // defpackage.AbstractC7487wq
                @NotNull
                public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                    return new C0086a(this.$block, jm);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                    return ((C0086a) create(kn, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    MN mn = MN.d;
                    int i = this.label;
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        Function1<JM<? super Unit>, Object> function1 = this.$block;
                        this.label = 1;
                        if (function1.invoke(this) == mn) {
                            return mn;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1795Pt1.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super JM<? super Unit>, ? extends Object> function1, JM<? super a> jm) {
                super(2, jm);
                this.$block = function1;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.$block, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    RV rv = C6266r20.a;
                    AbstractC8109zn0 abstractC8109zn0 = QV0.a;
                    C0086a c0086a = new C0086a(this.$block, null);
                    this.label = 1;
                    if (C5189lv.p(abstractC8109zn0, c0086a, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super JM<? super Unit>, ? extends Object> function1) {
            super(0);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            try {
                C5189lv.o(new a(this.$block, null));
            } catch (Exception e) {
                NS0.error("Exception on thread with switch to main", e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ML0 implements Function0<Unit> {
        final /* synthetic */ Function1<JM<? super Unit>, Object> $block;

        @InterfaceC3368dU(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$1$1", f = "ThreadUtils.kt", l = {70}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super JM<? super Unit>, ? extends Object> function1, JM<? super a> jm) {
                super(2, jm);
                this.$block = function1;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.$block, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    Function1<JM<? super Unit>, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super JM<? super Unit>, ? extends Object> function1) {
            super(0);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            try {
                C5189lv.o(new a(this.$block, null));
            } catch (Exception e) {
                NS0.error("Exception on thread", e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends ML0 implements Function0<Unit> {
        final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
        final /* synthetic */ String $name;

        @InterfaceC3368dU(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$2$1", f = "ThreadUtils.kt", l = {92}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ Function1<JM<? super Unit>, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super JM<? super Unit>, ? extends Object> function1, JM<? super a> jm) {
                super(2, jm);
                this.$block = function1;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.$block, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    Function1<JM<? super Unit>, Object> function1 = this.$block;
                    this.label = 1;
                    if (function1.invoke(this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super JM<? super Unit>, ? extends Object> function1) {
            super(0);
            this.$name = str;
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            try {
                C5189lv.o(new a(this.$block, null));
            } catch (Exception e) {
                NS0.error("Exception on thread '" + this.$name + '\'', e);
            }
        }
    }

    public static final void suspendifyBlocking(@NotNull Function1<? super JM<? super Unit>, ? extends Object> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        C5189lv.o(new a(block, null));
    }

    public static final void suspendifyOnMain(@NotNull Function1<? super JM<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C5208m0.t(0, 31, null, new b(block));
    }

    public static final void suspendifyOnThread(int i, @NotNull Function1<? super JM<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C5208m0.t(i, 15, null, new c(block));
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        suspendifyOnThread(i, function1);
    }

    public static final void suspendifyOnThread(@NotNull String name, int i, @NotNull Function1<? super JM<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        C5208m0.t(i, 7, name, new d(name, block));
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        suspendifyOnThread(str, i, function1);
    }
}
