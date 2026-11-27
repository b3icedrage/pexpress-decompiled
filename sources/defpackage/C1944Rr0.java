package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"LRr0;", "LO80;", "LMs0;", "LNs0;", "<init>", "()V", "LQw0;", "message", "", "messageWillDisplay", "(LQw0;)V", "messageWasDisplayed", "LUw0;", "action", "messageActionOccurredOnPreview", "(LQw0;LUw0;)V", "messageActionOccurredOnMessage", "Lax0;", "page", "messagePageChanged", "(LQw0;Lax0;)V", "messageWillDismiss", "messageWasDismissed", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1944Rr0 extends O80<InterfaceC1554Ms0> implements InterfaceC1635Ns0 {

    /* JADX INFO: renamed from: Rr0$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C2193Uw0 $action;
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1881Qw0 c1881Qw0, C2193Uw0 c2193Uw0) {
            super(1);
            this.$message = c1881Qw0;
            this.$action = c2193Uw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    /* JADX INFO: renamed from: Rr0$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C2193Uw0 $action;
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1881Qw0 c1881Qw0, C2193Uw0 c2193Uw0) {
            super(1);
            this.$message = c1881Qw0;
            this.$action = c2193Uw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    /* JADX INFO: renamed from: Rr0$c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C1881Qw0 $message;
        final /* synthetic */ C2840ax0 $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1881Qw0 c1881Qw0, C2840ax0 c2840ax0) {
            super(1);
            this.$message = c1881Qw0;
            this.$page = c2840ax0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessagePageChanged(this.$message, this.$page);
        }
    }

    /* JADX INFO: renamed from: Rr0$d */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDismissed(this.$message);
        }
    }

    /* JADX INFO: renamed from: Rr0$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDisplayed(this.$message);
        }
    }

    /* JADX INFO: renamed from: Rr0$f */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class f extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDismiss(this.$message);
        }
    }

    /* JADX INFO: renamed from: Rr0$g */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMs0;", "it", "", "invoke", "(LMs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class g extends ML0 implements Function1<InterfaceC1554Ms0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1554Ms0 interfaceC1554Ms0) {
            invoke2(interfaceC1554Ms0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1554Ms0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDisplay(this.$message);
        }
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageActionOccurredOnMessage(@NotNull C1881Qw0 message, @NotNull C2193Uw0 action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new a(message, action));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageActionOccurredOnPreview(@NotNull C1881Qw0 message, @NotNull C2193Uw0 action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new b(message, action));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messagePageChanged(@NotNull C1881Qw0 message, @NotNull C2840ax0 page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        fire(new c(message, page));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageWasDismissed(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new d(message));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageWasDisplayed(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new e(message));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageWillDismiss(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new f(message));
    }

    @Override // defpackage.InterfaceC1635Ns0
    public void messageWillDisplay(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new g(message));
    }
}
