package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.onesignal.common.AndroidUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\t*\u0002\u0087\u0001\b\u0000\u0018\u0000 \u008c\u00012\u00020\u0001:\u0004\u008d\u0001\u008e\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015J\u0013\u0010\u001e\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0017J\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J5\u00103\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*2\u0006\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u00010'2\u0006\u00102\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\b\u00100\u001a\u0004\u0018\u00010'2\u0006\u0010=\u001a\u00020-H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bC\u0010DJ\u0013\u0010E\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bE\u0010\u0017J\u001b\u0010F\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\bF\u0010\u0015J\u0013\u0010G\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bG\u0010\u0017J\u000f\u0010H\u001a\u00020\u000bH\u0002¢\u0006\u0004\bH\u0010 J\u000f\u0010I\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010 J'\u0010M\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020@H\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010U\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020PH\u0002¢\u0006\u0004\bU\u0010VJ'\u0010W\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020PH\u0002¢\u0006\u0004\bW\u0010VJ1\u0010Z\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020J2\u0006\u0010T\u001a\u00020P2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bZ\u0010[J\u001b\u0010\\\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020JH\u0082@ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J9\u0010c\u001a\u00020b2\u0006\u0010L\u001a\u00020J2\u0006\u0010^\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\u00182\b\u0010a\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0018H\u0002¢\u0006\u0004\be\u0010fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010mR\u0014\u0010n\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010oR\u0016\u0010p\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010q\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010r\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010oR\u0016\u0010s\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u0017\u0010t\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010iR\u0016\u0010|\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010iR$\u0010~\u001a\u00020\u00062\u0006\u0010}\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b~\u0010i\u001a\u0004\b~\u0010\u007fR\u0019\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010iR\u0018\u0010\u0086\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010iR\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008f\u0001"}, d2 = {"Ljx0;", "", "Landroid/webkit/WebView;", "webView", "LVw0;", "messageContent", "", "disableDragDismiss", "hideGrayOverlay", "<init>", "(Landroid/webkit/WebView;LVw0;ZZ)V", "", "setWebView", "(Landroid/webkit/WebView;)V", "Ljx0$b;", "messageController", "setMessageController", "(Ljx0$b;)V", "Landroid/app/Activity;", "activity", "showView", "(Landroid/app/Activity;LJM;)Ljava/lang/Object;", "checkIfShouldDismiss", "(LJM;)Ljava/lang/Object;", "", "pageHeight", "updateHeight", "(ILJM;)Ljava/lang/Object;", "currentActivity", "showInAppMessageView", "dismissAndAwaitNextMessage", "removeAllViews", "()V", "", "toString", "()Ljava/lang/String;", "content", "setMarginsFromContent", "(LVw0;)V", "Landroid/widget/RelativeLayout$LayoutParams;", "createParentRelativeLayoutParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "Lei2$c;", C3630ei2.IAM_DISPLAY_LOCATION_KEY, "disableDragging", "Lx30$c;", "createDraggableLayoutParams", "(ILei2$c;Z)Lx30$c;", "relativeLayoutParams", "draggableRelativeLayoutParams", "webViewLayoutParams", "showDraggableView", "(Lei2$c;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Lx30$c;LJM;)Ljava/lang/Object;", "Landroid/widget/RelativeLayout;", "parentRelativeLayout", "createPopupWindow", "(Landroid/widget/RelativeLayout;)V", "Landroid/content/Context;", "context", "setUpParentRelativeLayout", "(Landroid/content/Context;)V", "draggableParams", "setUpDraggableLayout", "(Landroid/content/Context;Landroid/widget/RelativeLayout$LayoutParams;Lx30$c;)V", "Landroidx/cardview/widget/CardView;", "createCardView", "(Landroid/content/Context;)Landroidx/cardview/widget/CardView;", "getHideDropShadow", "(Landroid/content/Context;)Z", "startDismissTimerIfNeeded", "delayShowUntilAvailable", "finishAfterDelay", "cleanupViewsAfterDismiss", "dereferenceViews", "Landroid/view/View;", "messageView", "backgroundView", "animateInAppMessage", "(Lei2$c;Landroid/view/View;Landroid/view/View;)V", "messageViewCardView", "Landroid/view/animation/Animation$AnimationListener;", "createAnimationListener", "(Landroidx/cardview/widget/CardView;)Landroid/view/animation/Animation$AnimationListener;", "height", "cardViewAnimCallback", "animateTop", "(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V", "animateBottom", "Landroid/animation/Animator$AnimatorListener;", "backgroundAnimCallback", "animateCenter", "(Landroid/view/View;Landroid/view/View;Landroid/view/animation/Animation$AnimationListener;Landroid/animation/Animator$AnimatorListener;)V", "animateAndDismissLayout", "(Landroid/view/View;LJM;)Ljava/lang/Object;", "duration", "startColor", "endColor", "animCallback", "Landroid/animation/ValueAnimator;", "animateBackgroundColor", "(Landroid/view/View;IIILandroid/animation/Animator$AnimatorListener;)Landroid/animation/ValueAnimator;", "getOverlayColor", "()I", "Landroid/webkit/WebView;", "LVw0;", "Z", "LF71;", "popupWindow", "LF71;", "Landroid/app/Activity;", "pageWidth", "I", "marginPxSizeLeft", "marginPxSizeRight", "marginPxSizeTop", "marginPxSizeBottom", "displayPosition", "Lei2$c;", "getDisplayPosition", "()Lei2$c;", "", "displayDuration", "D", "hasBackground", "shouldDismissWhenActive", "<set-?>", "isDragging", "()Z", "Landroid/widget/RelativeLayout;", "Lx30;", "draggableRelativeLayout", "Lx30;", "Ljx0$b;", "isDismissTimerSet", "cancelDismissTimer", "jx0$h", "popupWindowListener", "Ljx0$h;", "getDisplayYSize", "displayYSize", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4776jx0 {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;

    @NotNull
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;

    @Nullable
    private Activity currentActivity;
    private final boolean disableDragDismiss;
    private final double displayDuration;

    @NotNull
    private final C3630ei2.c displayPosition;

    @Nullable
    private C7531x30 draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;

    @NotNull
    private final C2271Vw0 messageContent;

    @Nullable
    private b messageController;
    private int pageHeight;
    private final int pageWidth;

    @Nullable
    private RelativeLayout parentRelativeLayout;

    @Nullable
    private F71 popupWindow;

    @NotNull
    private final h popupWindowListener;
    private boolean shouldDismissWhenActive;

    @Nullable
    private WebView webView;
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = Ie2.INSTANCE.dpToPx(4);

    /* JADX INFO: renamed from: jx0$b */
    public interface b {
        void onMessageWasDismissed();

        void onMessageWasDisplayed();

        void onMessageWillDismiss();
    }

    /* JADX INFO: renamed from: jx0$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3630ei2.c.values().length];
            iArr[C3630ei2.c.TOP_BANNER.ordinal()] = 1;
            iArr[C3630ei2.c.BOTTOM_BANNER.ordinal()] = 2;
            iArr[C3630ei2.c.CENTER_MODAL.ordinal()] = 3;
            iArr[C3630ei2.c.FULL_SCREEN.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: jx0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"jx0$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ C7659xf2 $waiter;

        public d(C7659xf2 c7659xf2) {
            this.$waiter = c7659xf2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C4776jx0.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    /* JADX INFO: renamed from: jx0$e */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"jx0$e", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class e implements Animation.AnimationListener {
        final /* synthetic */ CardView $messageViewCardView;
        final /* synthetic */ C4776jx0 this$0;

        public e(CardView cardView, C4776jx0 c4776jx0) {
            this.$messageViewCardView = cardView;
            this.this$0 = c4776jx0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.this$0.messageController != null) {
                b bVar = this.this$0.messageController;
                Intrinsics.checkNotNull(bVar);
                bVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: jx0$f */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", f = "InAppMessageView.kt", l = {450, 454, 455}, m = "delayShowUntilAvailable")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C4776jx0.this.delayShowUntilAvailable(null, this);
        }
    }

    /* JADX INFO: renamed from: jx0$g */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$finishAfterDelay$2", f = "InAppMessageView.kt", l = {477, 479}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public g(JM<? super g> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C4776jx0.this.new g(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                defpackage.C1795Pt1.b(r6)
                goto L2a
            L1c:
                defpackage.C1795Pt1.b(r6)
                r5.label = r3
                r3 = 600(0x258, double:2.964E-321)
                java.lang.Object r6 = defpackage.IW.b(r3, r5)
                if (r6 != r0) goto L2a
                goto L4b
            L2a:
                jx0 r6 = defpackage.C4776jx0.this
                boolean r6 = defpackage.C4776jx0.access$getHasBackground$p(r6)
                if (r6 == 0) goto L4c
                jx0 r6 = defpackage.C4776jx0.this
                android.widget.RelativeLayout r6 = defpackage.C4776jx0.access$getParentRelativeLayout$p(r6)
                if (r6 == 0) goto L4c
                jx0 r6 = defpackage.C4776jx0.this
                android.widget.RelativeLayout r1 = defpackage.C4776jx0.access$getParentRelativeLayout$p(r6)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r5.label = r2
                java.lang.Object r6 = defpackage.C4776jx0.access$animateAndDismissLayout(r6, r1, r5)
                if (r6 != r0) goto L51
            L4b:
                return r0
            L4c:
                jx0 r6 = defpackage.C4776jx0.this
                defpackage.C4776jx0.access$cleanupViewsAfterDismiss(r6)
            L51:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C4776jx0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jx0$h */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"jx0$h", "LF71$a;", "", "wasDismissedManually", "", "onDismiss", "(Ljava/lang/Boolean;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class h implements F71.a {
        public h() {
        }

        @Override // F71.a
        public void onDismiss(@Nullable Boolean wasDismissedManually) {
            if (Intrinsics.a(wasDismissedManually, Boolean.TRUE)) {
                return;
            }
            NS0.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
            b bVar = C4776jx0.this.messageController;
            if (bVar != null) {
                bVar.onMessageWasDismissed();
            }
        }
    }

    /* JADX INFO: renamed from: jx0$i */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"jx0$i", "Lx30$b;", "", "onDismiss", "()V", "onDragStart", "onDragEnd", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class i implements C7531x30.b {

        /* JADX INFO: renamed from: jx0$i$a */
        @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$setUpDraggableLayout$1$onDismiss$1", f = "InAppMessageView.kt", l = {351}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
            int label;
            final /* synthetic */ C4776jx0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4776jx0 c4776jx0, JM<? super a> jm) {
                super(1, jm);
                this.this$0 = c4776jx0;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@NotNull JM<?> jm) {
                return new a(this.this$0, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable JM<? super Unit> jm) {
                return ((a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C4776jx0 c4776jx0 = this.this$0;
                    this.label = 1;
                    if (c4776jx0.finishAfterDelay(this) == mn) {
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

        public i() {
        }

        @Override // defpackage.C7531x30.b
        public void onDismiss() {
            if (C4776jx0.this.messageController != null) {
                b bVar = C4776jx0.this.messageController;
                Intrinsics.checkNotNull(bVar);
                bVar.onMessageWillDismiss();
            }
            LY1.suspendifyOnThread$default(0, new a(C4776jx0.this, null), 1, null);
        }

        @Override // defpackage.C7531x30.b
        public void onDragEnd() {
            C4776jx0.this.isDragging = false;
        }

        @Override // defpackage.C7531x30.b
        public void onDragStart() {
            C4776jx0.this.isDragging = true;
        }
    }

    /* JADX INFO: renamed from: jx0$j */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$showDraggableView$2", f = "InAppMessageView.kt", l = {272}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class j extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3630ei2.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ C7531x30.c $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C7531x30.c cVar, C3630ei2.c cVar2, JM<? super j> jm) {
            super(2, jm);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = cVar;
            this.$displayLocation = cVar2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C4776jx0.this.new j(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((j) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                if (C4776jx0.this.webView == null) {
                    return Unit.a;
                }
                WebView webView = C4776jx0.this.webView;
                Intrinsics.checkNotNull(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                C4776jx0 c4776jx0 = C4776jx0.this;
                Activity activity = c4776jx0.currentActivity;
                Intrinsics.checkNotNull(activity);
                c4776jx0.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                C4776jx0 c4776jx1 = C4776jx0.this;
                Activity activity2 = c4776jx1.currentActivity;
                Intrinsics.checkNotNull(activity2);
                c4776jx1.setUpParentRelativeLayout(activity2);
                C4776jx0 c4776jx2 = C4776jx0.this;
                RelativeLayout relativeLayout = c4776jx2.parentRelativeLayout;
                Intrinsics.checkNotNull(relativeLayout);
                c4776jx2.createPopupWindow(relativeLayout);
                if (C4776jx0.this.messageController != null) {
                    C4776jx0 c4776jx3 = C4776jx0.this;
                    C3630ei2.c cVar = this.$displayLocation;
                    C7531x30 c7531x30 = c4776jx3.draggableRelativeLayout;
                    Intrinsics.checkNotNull(c7531x30);
                    RelativeLayout relativeLayout2 = C4776jx0.this.parentRelativeLayout;
                    Intrinsics.checkNotNull(relativeLayout2);
                    c4776jx3.animateInAppMessage(cVar, c7531x30, relativeLayout2);
                }
                C4776jx0 c4776jx4 = C4776jx0.this;
                this.label = 1;
                if (c4776jx4.startDismissTimerIfNeeded(this) == mn) {
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

    /* JADX INFO: renamed from: jx0$k */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", f = "InAppMessageView.kt", l = {428, 439}, m = "startDismissTimerIfNeeded")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class k extends LM {
        Object L$0;
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
            return C4776jx0.this.startDismissTimerIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: jx0$l */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$updateHeight$2", f = "InAppMessageView.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class l extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i, JM<? super l> jm) {
            super(2, jm);
            this.$pageHeight = i;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C4776jx0.this.new l(this.$pageHeight, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((l) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            if (C4776jx0.this.webView == null) {
                NS0.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return Unit.a;
            }
            WebView webView = C4776jx0.this.webView;
            Intrinsics.checkNotNull(webView);
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                NS0.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return Unit.a;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView2 = C4776jx0.this.webView;
            Intrinsics.checkNotNull(webView2);
            webView2.setLayoutParams(layoutParams);
            if (C4776jx0.this.draggableRelativeLayout != null) {
                C7531x30 c7531x30 = C4776jx0.this.draggableRelativeLayout;
                Intrinsics.checkNotNull(c7531x30);
                C4776jx0 c4776jx0 = C4776jx0.this;
                c7531x30.setParams(c4776jx0.createDraggableLayoutParams(this.$pageHeight, c4776jx0.getDisplayPosition(), C4776jx0.this.disableDragDismiss));
            }
            return Unit.a;
        }
    }

    public C4776jx0(@Nullable WebView webView, @NotNull C2271Vw0 messageContent, boolean z, boolean z2) {
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z;
        this.hideGrayOverlay = z2;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        Ie2 ie2 = Ie2.INSTANCE;
        this.marginPxSizeLeft = ie2.dpToPx(24);
        this.marginPxSizeRight = ie2.dpToPx(24);
        this.marginPxSizeTop = ie2.dpToPx(24);
        this.marginPxSizeBottom = ie2.dpToPx(24);
        C3630ei2.c displayLocation = messageContent.getDisplayLocation();
        Intrinsics.checkNotNull(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            dDoubleValue = 0.0d;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            Intrinsics.checkNotNull(displayDuration);
            dDoubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = dDoubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new h();
        setMarginsFromContent(messageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, JM<? super Unit> jm) {
        C7659xf2 c7659xf2 = new C7659xf2();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new d(c7659xf2)).start();
        Object objWaitForWake = c7659xf2.waitForWake(jm);
        return objWaitForWake == MN.d ? objWaitForWake : Unit.a;
    }

    private final ValueAnimator animateBackgroundColor(View backgroundView, int duration, int startColor, int endColor, Animator.AnimatorListener animCallback) {
        return A91.INSTANCE.animateViewColor(backgroundView, duration, startColor, endColor, animCallback);
    }

    private final void animateBottom(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        A91.INSTANCE.animateViewByTranslation(messageView, height + this.marginPxSizeBottom, 0.0f, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, new B91(0.1d, 8.0d), cardViewAnimCallback).start();
    }

    private final void animateCenter(View messageView, View backgroundView, Animation.AnimationListener cardViewAnimCallback, Animator.AnimatorListener backgroundAnimCallback) {
        Animation animationAnimateViewSmallToLarge = A91.INSTANCE.animateViewSmallToLarge(messageView, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, new B91(0.1d, 8.0d), cardViewAnimCallback);
        ValueAnimator valueAnimatorAnimateBackgroundColor = animateBackgroundColor(backgroundView, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), backgroundAnimCallback);
        animationAnimateViewSmallToLarge.start();
        valueAnimatorAnimateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(C3630ei2.c displayLocation, View messageView, View backgroundView) {
        Intrinsics.checkNotNull(messageView);
        CardView messageViewCardView = (CardView) messageView.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Intrinsics.checkNotNullExpressionValue(messageViewCardView, "messageViewCardView");
        Animation.AnimationListener animationListenerCreateAnimationListener = createAnimationListener(messageViewCardView);
        int i2 = c.$EnumSwitchMapping$0[displayLocation.ordinal()];
        if (i2 == 1) {
            WebView webView = this.webView;
            Intrinsics.checkNotNull(webView);
            animateTop(messageViewCardView, webView.getHeight(), animationListenerCreateAnimationListener);
        } else if (i2 == 2) {
            WebView webView2 = this.webView;
            Intrinsics.checkNotNull(webView2);
            animateBottom(messageViewCardView, webView2.getHeight(), animationListenerCreateAnimationListener);
        } else if (i2 == 3 || i2 == 4) {
            animateCenter(messageView, backgroundView, animationListenerCreateAnimationListener, null);
        }
    }

    private final void animateTop(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        A91.INSTANCE.animateViewByTranslation(messageView, (-height) - this.marginPxSizeTop, 0.0f, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, new B91(0.1d, 8.0d), cardViewAnimCallback).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        b bVar = this.messageController;
        if (bVar != null) {
            bVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(CardView messageViewCardView) {
        return new e(messageViewCardView, this);
    }

    private final CardView createCardView(Context context) {
        CardView cardView = new CardView(context, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == C3630ei2.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation(Ie2.INSTANCE.dpToPx(5));
        }
        cardView.setRadius(Ie2.INSTANCE.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7531x30.c createDraggableLayoutParams(int pageHeight, C3630ei2.c displayLocation, boolean disableDragging) {
        C7531x30.c cVar = new C7531x30.c();
        cVar.setMaxXPos(this.marginPxSizeRight);
        cVar.setMaxYPos(this.marginPxSizeTop);
        cVar.setDraggingDisabled(disableDragging);
        cVar.setMessageHeight(pageHeight);
        cVar.setHeight(getDisplayYSize());
        int i2 = c.$EnumSwitchMapping$0[displayLocation.ordinal()];
        if (i2 == 1) {
            cVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i2 == 2) {
            cVar.setPosY(getDisplayYSize() - pageHeight);
            cVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i2 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (pageHeight / 2);
            cVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            cVar.setMaxYPos(displayYSize);
            cVar.setPosY(displayYSize);
        } else if (i2 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            cVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            cVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            cVar.setMaxYPos(displayYSize3);
            cVar.setPosY(displayYSize3);
        }
        cVar.setDragDirection(displayLocation == C3630ei2.c.TOP_BANNER ? 0 : 1);
        return cVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i2 = c.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i2 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 != 3 && i2 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout parentRelativeLayout) {
        boolean z = this.hasBackground;
        F71 f71 = new F71(parentRelativeLayout, z ? -1 : this.pageWidth, z ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = f71;
        f71.setBackgroundDrawable(new ColorDrawable(0));
        F71 f72 = this.popupWindow;
        int i2 = 1;
        if (f72 != null) {
            f72.setTouchable(true);
        }
        F71 f73 = this.popupWindow;
        if (f73 != null) {
            f73.setFocusable(!this.displayPosition.isBanner());
        }
        F71 f74 = this.popupWindow;
        if (f74 != null) {
            f74.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i2 = 0;
        } else {
            int i3 = c.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i3 == 1) {
                i2 = 49;
            } else if (i3 == 2) {
                i2 = 81;
            } else if (i3 != 3 && i3 != 4) {
                throw new C6489s51();
            }
        }
        int i4 = this.messageContent.getIsFullBleed() ? CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT : 1003;
        F71 f75 = this.popupWindow;
        Intrinsics.checkNotNull(f75);
        C1909Rf1.d(f75, i4);
        F71 f76 = this.popupWindow;
        if (f76 != null) {
            Activity activity = this.currentActivity;
            Intrinsics.checkNotNull(activity);
            f76.showAtLocation(activity.getWindow().getDecorView().getRootView(), i2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (showInAppMessageView(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r2.delayShowUntilAvailable(r7, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object delayShowUntilAvailable(android.app.Activity r7, defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C4776jx0.f
            if (r0 == 0) goto L13
            r0 = r8
            jx0$f r0 = (defpackage.C4776jx0.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jx0$f r0 = new jx0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r8)
            goto L7e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.L$1
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r2 = r0.L$0
            jx0 r2 = (defpackage.C4776jx0) r2
            defpackage.C1795Pt1.b(r8)
            goto L70
        L41:
            defpackage.C1795Pt1.b(r8)
            goto L5d
        L45:
            defpackage.C1795Pt1.b(r8)
            com.onesignal.common.AndroidUtils r8 = com.onesignal.common.AndroidUtils.INSTANCE
            boolean r8 = r8.isActivityFullyReady(r7)
            if (r8 == 0) goto L60
            android.widget.RelativeLayout r8 = r6.parentRelativeLayout
            if (r8 != 0) goto L60
            r0.label = r5
            java.lang.Object r7 = r6.showInAppMessageView(r7, r0)
            if (r7 != r1) goto L5d
            goto L7d
        L5d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L60:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = defpackage.IW.b(r4, r0)
            if (r8 != r1) goto L6f
            goto L7d
        L6f:
            r2 = r6
        L70:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r2.delayShowUntilAvailable(r7, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4776jx0.delayShowUntilAvailable(android.app.Activity, JM):java.lang.Object");
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(JM<? super Unit> jm) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new g(null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    private final int getDisplayYSize() {
        Ie2 ie2 = Ie2.INSTANCE;
        Activity activity = this.currentActivity;
        Intrinsics.checkNotNull(activity);
        return ie2.getWindowHeight(activity);
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }

    private final void setMarginsFromContent(C2271Vw0 content) {
        this.marginPxSizeTop = content.getUseHeightMargin() ? Ie2.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = content.getUseHeightMargin() ? Ie2.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = content.getUseWidthMargin() ? Ie2.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = content.getUseWidthMargin() ? Ie2.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams relativeLayoutParams, C7531x30.c draggableParams) {
        C7531x30 c7531x30 = new C7531x30(context);
        this.draggableRelativeLayout = c7531x30;
        if (relativeLayoutParams != null) {
            Intrinsics.checkNotNull(c7531x30);
            c7531x30.setLayoutParams(relativeLayoutParams);
        }
        C7531x30 c7531x31 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x31);
        c7531x31.setParams(draggableParams);
        C7531x30 c7531x32 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x32);
        c7531x32.setListener(new i());
        WebView webView = this.webView;
        Intrinsics.checkNotNull(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            Intrinsics.checkNotNull(webView2);
            ViewParent parent = webView2.getParent();
            Intrinsics.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        CardView cardViewCreateCardView = createCardView(context);
        cardViewCreateCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        cardViewCreateCardView.addView(this.webView);
        C7531x30 c7531x33 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x33);
        c7531x33.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        C7531x30 c7531x34 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x34);
        c7531x34.setClipChildren(false);
        C7531x30 c7531x35 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x35);
        c7531x35.setClipToPadding(false);
        C7531x30 c7531x36 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(c7531x36);
        c7531x36.addView(cardViewCreateCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(C3630ei2.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C7531x30.c cVar2, JM<? super Unit> jm) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new j(layoutParams, layoutParams2, cVar2, cVar, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startDismissTimerIfNeeded(JM<? super Unit> jm) {
        k kVar;
        C4776jx0 c4776jx0;
        C4776jx0 c4776jx1;
        if (jm instanceof k) {
            kVar = (k) jm;
            int i2 = kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.label = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(jm);
            }
        } else {
            kVar = new k(jm);
        }
        Object obj = kVar.result;
        MN mn = MN.d;
        int i3 = kVar.label;
        if (i3 != 0) {
            if (i3 == 1) {
                c4776jx0 = (C4776jx0) kVar.L$0;
                C1795Pt1.b(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4776jx1 = (C4776jx0) kVar.L$0;
                C1795Pt1.b(obj);
            }
            c4776jx1.isDismissTimerSet = false;
            return Unit.a;
        }
        C1795Pt1.b(obj);
        double d2 = this.displayDuration;
        if (d2 <= 0.0d || this.isDismissTimerSet) {
            return Unit.a;
        }
        this.isDismissTimerSet = true;
        long j2 = ((long) d2) * ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        kVar.L$0 = this;
        kVar.label = 1;
        if (IW.b(j2, kVar) != mn) {
            c4776jx0 = this;
        }
        return mn;
        if (c4776jx0.cancelDismissTimer) {
            c4776jx0.cancelDismissTimer = false;
            return Unit.a;
        }
        b bVar = c4776jx0.messageController;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            bVar.onMessageWillDismiss();
        }
        if (c4776jx0.currentActivity != null) {
            kVar.L$0 = c4776jx0;
            kVar.label = 2;
            if (c4776jx0.dismissAndAwaitNextMessage(kVar) != mn) {
                c4776jx1 = c4776jx0;
                c4776jx1.isDismissTimerSet = false;
            }
            return mn;
        }
        c4776jx0.shouldDismissWhenActive = true;
        return Unit.a;
    }

    @Nullable
    public final Object checkIfShouldDismiss(@NotNull JM<? super Unit> jm) throws Throwable {
        if (!this.shouldDismissWhenActive) {
            return Unit.a;
        }
        this.shouldDismissWhenActive = false;
        Object objFinishAfterDelay = finishAfterDelay(jm);
        return objFinishAfterDelay == MN.d ? objFinishAfterDelay : Unit.a;
    }

    @Nullable
    public final Object dismissAndAwaitNextMessage(@NotNull JM<? super Unit> jm) throws Throwable {
        C7531x30 c7531x30 = this.draggableRelativeLayout;
        if (c7531x30 == null) {
            NS0.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return Unit.a;
        }
        Intrinsics.checkNotNull(c7531x30);
        c7531x30.dismiss();
        Object objFinishAfterDelay = finishAfterDelay(jm);
        return objFinishAfterDelay == MN.d ? objFinishAfterDelay : Unit.a;
    }

    @NotNull
    public final C3630ei2.c getDisplayPosition() {
        return this.displayPosition;
    }

    /* JADX INFO: renamed from: isDragging, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        NS0.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        F71 f71 = this.popupWindow;
        if (f71 != null) {
            f71.setWasDismissedManually(Boolean.TRUE);
        }
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        C7531x30 c7531x30 = this.draggableRelativeLayout;
        if (c7531x30 != null) {
            c7531x30.removeAllViews();
        }
        F71 f72 = this.popupWindow;
        if (f72 != null) {
            f72.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(@Nullable b messageController) {
        this.messageController = messageController;
    }

    public final void setWebView(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    @Nullable
    public final Object showInAppMessageView(@Nullable Activity activity, @NotNull JM<? super Unit> jm) throws Throwable {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsCreateParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        C3630ei2.c cVar = this.displayPosition;
        Object objShowDraggableView = showDraggableView(cVar, layoutParams, layoutParamsCreateParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), jm);
        return objShowDraggableView == MN.d ? objShowDraggableView : Unit.a;
    }

    @Nullable
    public final Object showView(@NotNull Activity activity, @NotNull JM<? super Unit> jm) {
        Object objDelayShowUntilAvailable = delayShowUntilAvailable(activity, jm);
        return objDelayShowUntilAvailable == MN.d ? objDelayShowUntilAvailable : Unit.a;
    }

    @NotNull
    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    @Nullable
    public final Object updateHeight(int i2, @NotNull JM<? super Unit> jm) throws Throwable {
        this.pageHeight = i2;
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new l(i2, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
