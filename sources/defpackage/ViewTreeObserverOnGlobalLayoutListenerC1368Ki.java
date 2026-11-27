package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010!J\u001f\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010!J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u0005J\u0013\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010,J\u001d\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\"\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010J\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0014\u0010N\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR(\u0010S\u001a\u0004\u0018\u00010\b2\b\u0010O\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"LKi;", "LWr0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "()V", "", "orientation", "Landroid/app/Activity;", "activity", "", "onOrientationChanged", "(ILandroid/app/Activity;)V", "handleLostFocus", "handleFocus", "Landroid/content/Context;", "context", "start", "(Landroid/content/Context;)V", "LVr0;", "handler", "addApplicationLifecycleHandler", "(LVr0;)V", "removeApplicationLifecycleHandler", "LTr0;", "addActivityLifecycleHandler", "(LTr0;)V", "removeActivityLifecycleHandler", "Landroid/os/Bundle;", "bundle", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "p0", "p1", "onActivitySaveInstanceState", "onActivityDestroyed", "onGlobalLayout", "", "waitUntilSystemConditionsAvailable", "(LJM;)Ljava/lang/Object;", "waitUntilActivityReady", "Ljava/lang/Runnable;", "runnable", "decorViewReady", "(Landroid/app/Activity;Ljava/lang/Runnable;)V", "LO80;", "activityLifecycleNotifier", "LO80;", "applicationLifecycleNotifier", "Lev0;", "systemConditionNotifier", "LEg;", "entryState", "LEg;", "getEntryState", "()LEg;", "setEntryState", "(LEg;)V", "_appContext", "Landroid/content/Context;", "_current", "Landroid/app/Activity;", "nextResumeIsFirstActivity", "Z", "activityReferences", "I", "isActivityChangingConfigurations", "getWasInBackground", "()Z", "wasInBackground", "isInForeground", "getAppContext", "()Landroid/content/Context;", "appContext", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getCurrent", "()Landroid/app/Activity;", "setCurrent", "current", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewTreeObserverOnGlobalLayoutListenerC1368Ki implements InterfaceC2338Wr0, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {

    @Nullable
    private Context _appContext;

    @Nullable
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;

    @NotNull
    private final O80<InterfaceC2100Tr0> activityLifecycleNotifier = new O80<>();

    @NotNull
    private final O80<InterfaceC2256Vr0> applicationLifecycleNotifier = new O80<>();

    @NotNull
    private final O80<InterfaceC3672ev0> systemConditionNotifier = new O80<>();

    @NotNull
    private EnumC0894Eg entryState = EnumC0894Eg.APP_CLOSE;

    /* JADX INFO: renamed from: Ki$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTr0;", "it", "", "invoke", "(LTr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC2100Tr0, Unit> {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2100Tr0 interfaceC2100Tr0) {
            invoke2(interfaceC2100Tr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2100Tr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$value);
        }
    }

    /* JADX INFO: renamed from: Ki$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ki$b", "La7;", "Landroid/app/Activity;", "currentActivity", "", "onActivityAvailable", "(Landroid/app/Activity;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b extends C2653a7 {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1368Ki this$0;

        public b(Runnable runnable, ViewTreeObserverOnGlobalLayoutListenerC1368Ki viewTreeObserverOnGlobalLayoutListenerC1368Ki) {
            this.$runnable = runnable;
            this.this$0 = viewTreeObserverOnGlobalLayoutListenerC1368Ki;
        }

        @Override // defpackage.C2653a7, defpackage.InterfaceC2100Tr0
        public void onActivityAvailable(@NotNull Activity currentActivity) {
            Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
            ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(currentActivity, this.$runnable);
            }
        }
    }

    /* JADX INFO: renamed from: Ki$c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVr0;", "it", "", "invoke", "(LVr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC2256Vr0, Unit> {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2256Vr0 interfaceC2256Vr0) {
            invoke2(interfaceC2256Vr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2256Vr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onFocus(false);
        }
    }

    /* JADX INFO: renamed from: Ki$d */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVr0;", "it", "", "invoke", "(LVr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d extends ML0 implements Function1<InterfaceC2256Vr0, Unit> {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2256Vr0 interfaceC2256Vr0) {
            invoke2(interfaceC2256Vr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2256Vr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onUnfocused();
        }
    }

    /* JADX INFO: renamed from: Ki$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTr0;", "it", "", "invoke", "(LTr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e extends ML0 implements Function1<InterfaceC2100Tr0, Unit> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2100Tr0 interfaceC2100Tr0) {
            invoke2(interfaceC2100Tr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2100Tr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    /* JADX INFO: renamed from: Ki$f */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lev0;", "it", "", "invoke", "(Lev0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class f extends ML0 implements Function1<InterfaceC3672ev0, Unit> {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3672ev0 interfaceC3672ev0) {
            invoke2(interfaceC3672ev0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC3672ev0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.systemConditionChanged();
        }
    }

    /* JADX INFO: renamed from: Ki$g */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTr0;", "it", "", "invoke", "(LTr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class g extends ML0 implements Function1<InterfaceC2100Tr0, Unit> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2100Tr0 interfaceC2100Tr0) {
            invoke2(interfaceC2100Tr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2100Tr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    /* JADX INFO: renamed from: Ki$h */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTr0;", "it", "", "invoke", "(LTr0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class h extends ML0 implements Function1<InterfaceC2100Tr0, Unit> {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2100Tr0 interfaceC2100Tr0) {
            invoke2(interfaceC2100Tr0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2100Tr0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$activity);
        }
    }

    /* JADX INFO: renamed from: Ki$j */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.application.impl.ApplicationService", f = "ApplicationService.kt", l = {309}, m = "waitUntilActivityReady")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends LM {
        int label;
        /* synthetic */ Object result;

        public j(JM<? super j> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.waitUntilActivityReady(this);
        }
    }

    /* JADX INFO: renamed from: Ki$k */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.application.impl.ApplicationService", f = "ApplicationService.kt", l = {238, 269, 296}, m = "waitUntilSystemConditionsAvailable")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class k extends LM {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(JM<? super k> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    /* JADX INFO: renamed from: Ki$l */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ki$l", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/Fragment;", "fragmentDetached", "", "onFragmentDetached", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class l extends FragmentManager.FragmentLifecycleCallbacks {
        final /* synthetic */ FragmentManager $manager;
        final /* synthetic */ C7659xf2 $waiter;

        public l(FragmentManager fragmentManager, C7659xf2 c7659xf2) {
            this.$manager = fragmentManager;
            this.$waiter = c7659xf2;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDetached(@NotNull FragmentManager fm, @NotNull Fragment fragmentDetached) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(fragmentDetached, "fragmentDetached");
            super.onFragmentDetached(fm, fragmentDetached);
            if (fragmentDetached instanceof DialogFragment) {
                this.$manager.d0(this);
                this.$waiter.wake();
            }
        }
    }

    /* JADX INFO: renamed from: Ki$m */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ki$m", "Lev0;", "", "systemConditionChanged", "()V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class m implements InterfaceC3672ev0 {
        final /* synthetic */ C7659xf2 $waiter;

        public m(C7659xf2 c7659xf2) {
            this.$waiter = c7659xf2;
        }

        @Override // defpackage.InterfaceC3672ev0
        public void systemConditionChanged() {
            if (C5839p00.INSTANCE.isKeyboardUp(new WeakReference<>(ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.get_current()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decorViewReady$lambda-1, reason: not valid java name */
    public static final void m8decorViewReady$lambda1(ViewTreeObserverOnGlobalLayoutListenerC1368Ki self, Runnable runnable, ViewTreeObserverOnGlobalLayoutListenerC1368Ki this$0) {
        Intrinsics.checkNotNullParameter(self, "$self");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        self.addActivityLifecycleHandler(self.new b(runnable, this$0));
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            NS0.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        NS0.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != EnumC0894Eg.NOTIFICATION_CLICK) {
            setEntryState(EnumC0894Eg.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(c.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            NS0.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        NS0.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(EnumC0894Eg.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(d.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int orientation, Activity activity) {
        if (orientation == 1) {
            NS0.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + orientation + ") on activity: " + activity, null, 2, null);
        } else if (orientation == 2) {
            NS0.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + orientation + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: waitUntilActivityReady$lambda-0, reason: not valid java name */
    public static final void m9waitUntilActivityReady$lambda0(C7659xf2 waiter) {
        Intrinsics.checkNotNullParameter(waiter, "$waiter");
        waiter.wake();
    }

    @Override // defpackage.InterfaceC2338Wr0
    public void addActivityLifecycleHandler(@NotNull InterfaceC2100Tr0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (get_current() != null) {
            Activity activity = get_current();
            Intrinsics.checkNotNull(activity);
            handler.onActivityAvailable(activity);
        }
    }

    @Override // defpackage.InterfaceC2338Wr0
    public void addApplicationLifecycleHandler(@NotNull InterfaceC2256Vr0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (get_current() != null) {
            handler.onFocus(true);
        }
    }

    public final void decorViewReady(@NotNull Activity activity, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new RunnableC1212Ii((Object) this, runnable, (Object) this, 0));
    }

    @Override // defpackage.InterfaceC2338Wr0
    @NotNull
    public Context getAppContext() {
        Context context = this._appContext;
        Intrinsics.checkNotNull(context);
        return context;
    }

    @Override // defpackage.InterfaceC2338Wr0
    @Nullable
    /* JADX INFO: renamed from: getCurrent, reason: from getter */
    public Activity get_current() {
        return this._current;
    }

    @Override // defpackage.InterfaceC2338Wr0
    @NotNull
    public EnumC0894Eg getEntryState() {
        return this.entryState;
    }

    @Override // defpackage.InterfaceC2338Wr0
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!Intrinsics.a(get_current(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity p0, @NotNull Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (Intrinsics.a(get_current(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = zIsChangingConfigurations;
        if (!zIsChangingConfigurations) {
            int i2 = this.activityReferences - 1;
            this.activityReferences = i2;
            if (i2 <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new e(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(f.INSTANCE);
    }

    @Override // defpackage.InterfaceC2338Wr0
    public void removeActivityLifecycleHandler(@NotNull InterfaceC2100Tr0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // defpackage.InterfaceC2338Wr0
    public void removeApplicationLifecycleHandler(@NotNull InterfaceC2256Vr0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(@Nullable Activity activity) {
        this._current = activity;
        NS0.debug$default("ApplicationService: current activity=" + get_current(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // defpackage.InterfaceC2338Wr0
    public void setEntryState(@NotNull EnumC0894Eg enumC0894Eg) {
        Intrinsics.checkNotNullParameter(enumC0894Eg, "<set-?>");
        this.entryState = enumC0894Eg;
    }

    public final void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i());
        boolean z = context instanceof Activity;
        boolean z2 = get_current() == null;
        if (!z2 || z) {
            setEntryState(EnumC0894Eg.APP_OPEN);
            if (z2 && z) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(EnumC0894Eg.APP_CLOSE);
        }
        NS0.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2338Wr0
    @Nullable
    public Object waitUntilActivityReady(@NotNull JM<? super Boolean> jm) {
        j jVar;
        if (jm instanceof j) {
            jVar = (j) jm;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(jm);
            }
        } else {
            jVar = new j(jm);
        }
        Object obj = jVar.result;
        MN mn = MN.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            Activity activity = get_current();
            if (activity == null) {
                return Boolean.FALSE;
            }
            C7659xf2 c7659xf2 = new C7659xf2();
            decorViewReady(activity, new RunnableC1290Ji(c7659xf2, 0));
            jVar.label = 1;
            if (c7659xf2.waitForWake(jVar) == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[Catch: NoClassDefFoundError -> 0x00e0, TryCatch #0 {NoClassDefFoundError -> 0x00e0, blocks: (B:37:0x0095, B:39:0x0099, B:41:0x00b8, B:43:0x00be, B:45:0x00c2), top: B:63:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (defpackage.IW.b(100, r0) == r1) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:22:0x005a). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC2338Wr0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object waitUntilSystemConditionsAvailable(@org.jetbrains.annotations.NotNull defpackage.JM<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC1368Ki.waitUntilSystemConditionsAvailable(JM):java.lang.Object");
    }

    /* JADX INFO: renamed from: Ki$i */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ki$i", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class i implements ComponentCallbacks {
        public i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            if (ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.get_current() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity activity = ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this.get_current();
                Intrinsics.checkNotNull(activity);
                if (androidUtils.hasConfigChangeFlag(activity, UserVerificationMethods.USER_VERIFY_PATTERN)) {
                    ViewTreeObserverOnGlobalLayoutListenerC1368Ki viewTreeObserverOnGlobalLayoutListenerC1368Ki = ViewTreeObserverOnGlobalLayoutListenerC1368Ki.this;
                    int i = newConfig.orientation;
                    Activity activity2 = viewTreeObserverOnGlobalLayoutListenerC1368Ki.get_current();
                    Intrinsics.checkNotNull(activity2);
                    viewTreeObserverOnGlobalLayoutListenerC1368Ki.onOrientationChanged(i, activity2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
