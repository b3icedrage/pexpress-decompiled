package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0003\"#$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006%"}, d2 = {"Lx30;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "createDragHelper", "()V", "Lx30$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lx30$b;)V", "Lx30$c;", "params", "setParams", "(Lx30$c;)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "computeScroll", "dismiss", "mListener", "Lx30$b;", "LGd2;", "mDragHelper", "LGd2;", "dismissing", "Z", "draggingDisabled", "Lx30$c;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "c", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7531x30 extends RelativeLayout {
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;

    @Nullable
    private Gd2 mDragHelper;

    @Nullable
    private b mListener;

    @Nullable
    private c params;

    /* JADX INFO: renamed from: x30$b */
    public interface b {
        void onDismiss();

        void onDragEnd();

        void onDragStart();
    }

    /* JADX INFO: renamed from: x30$c */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\n¨\u0006/"}, d2 = {"Lx30$c;", "", "<init>", "()V", "", "posY", "I", "getPosY", "()I", "setPosY", "(I)V", "maxYPos", "getMaxYPos", "setMaxYPos", "dragThresholdY", "getDragThresholdY", "setDragThresholdY", "maxXPos", "getMaxXPos", "setMaxXPos", "height", "getHeight", "setHeight", "messageHeight", "getMessageHeight", "setMessageHeight", "dragDirection", "getDragDirection", "setDragDirection", "", "draggingDisabled", "Z", "getDraggingDisabled", "()Z", "setDraggingDisabled", "(Z)V", "dismissingYVelocity", "getDismissingYVelocity", "setDismissingYVelocity", "offScreenYPos", "getOffScreenYPos", "setOffScreenYPos", "dismissingYPos", "getDismissingYPos", "setDismissingYPos", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i) {
            this.dismissingYPos = i;
        }

        public final void setDismissingYVelocity(int i) {
            this.dismissingYVelocity = i;
        }

        public final void setDragDirection(int i) {
            this.dragDirection = i;
        }

        public final void setDragThresholdY(int i) {
            this.dragThresholdY = i;
        }

        public final void setDraggingDisabled(boolean z) {
            this.draggingDisabled = z;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setMaxXPos(int i) {
            this.maxXPos = i;
        }

        public final void setMaxYPos(int i) {
            this.maxYPos = i;
        }

        public final void setMessageHeight(int i) {
            this.messageHeight = i;
        }

        public final void setOffScreenYPos(int i) {
            this.offScreenYPos = i;
        }

        public final void setPosY(int i) {
            this.posY = i;
        }
    }

    /* JADX INFO: renamed from: x30$d */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"x30$d", "LGd2$c;", "Landroid/view/View;", "child", "", "pointerId", "", "tryCaptureView", "(Landroid/view/View;I)Z", "top", "dy", "clampViewPositionVertical", "(Landroid/view/View;II)I", "right", "clampViewPositionHorizontal", "releasedChild", "", "xvel", "yvel", "", "onViewReleased", "(Landroid/view/View;FF)V", "lastYPos", "I", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d extends Gd2.c {
        private int lastYPos;

        public d() {
        }

        @Override // Gd2.c
        public int clampViewPositionHorizontal(@NotNull View child, int right, int dy) {
            Intrinsics.checkNotNullParameter(child, "child");
            c cVar = C7531x30.this.params;
            Intrinsics.checkNotNull(cVar);
            return cVar.getMaxXPos();
        }

        @Override // Gd2.c
        public int clampViewPositionVertical(@NotNull View child, int top, int dy) {
            Intrinsics.checkNotNullParameter(child, "child");
            c cVar = C7531x30.this.params;
            Intrinsics.checkNotNull(cVar);
            if (cVar.getDraggingDisabled()) {
                c cVar2 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar2);
                return cVar2.getMaxYPos();
            }
            this.lastYPos = top;
            c cVar3 = C7531x30.this.params;
            Intrinsics.checkNotNull(cVar3);
            if (cVar3.getDragDirection() == 1) {
                c cVar4 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar4);
                if (top >= cVar4.getDragThresholdY() && C7531x30.this.mListener != null) {
                    b bVar = C7531x30.this.mListener;
                    Intrinsics.checkNotNull(bVar);
                    bVar.onDragStart();
                }
                c cVar5 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar5);
                if (top < cVar5.getMaxYPos()) {
                    c cVar6 = C7531x30.this.params;
                    Intrinsics.checkNotNull(cVar6);
                    return cVar6.getMaxYPos();
                }
            } else {
                c cVar7 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar7);
                if (top <= cVar7.getDragThresholdY() && C7531x30.this.mListener != null) {
                    b bVar2 = C7531x30.this.mListener;
                    Intrinsics.checkNotNull(bVar2);
                    bVar2.onDragStart();
                }
                c cVar8 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar8);
                if (top > cVar8.getMaxYPos()) {
                    c cVar9 = C7531x30.this.params;
                    Intrinsics.checkNotNull(cVar9);
                    return cVar9.getMaxYPos();
                }
            }
            return top;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
        @Override // Gd2.c
        public void onViewReleased(@NotNull View releasedChild, float xvel, float yvel) {
            Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
            c cVar = C7531x30.this.params;
            Intrinsics.checkNotNull(cVar);
            int maxYPos = cVar.getMaxYPos();
            if (!C7531x30.this.dismissing) {
                c cVar2 = C7531x30.this.params;
                Intrinsics.checkNotNull(cVar2);
                if (cVar2.getDragDirection() == 1) {
                    int i = this.lastYPos;
                    c cVar3 = C7531x30.this.params;
                    Intrinsics.checkNotNull(cVar3);
                    if (i <= cVar3.getDismissingYPos()) {
                        c cVar4 = C7531x30.this.params;
                        Intrinsics.checkNotNull(cVar4);
                        if (yvel > cVar4.getDismissingYVelocity()) {
                            c cVar5 = C7531x30.this.params;
                            Intrinsics.checkNotNull(cVar5);
                            maxYPos = cVar5.getOffScreenYPos();
                            C7531x30.this.dismissing = true;
                            if (C7531x30.this.mListener != null) {
                                b bVar = C7531x30.this.mListener;
                                Intrinsics.checkNotNull(bVar);
                                bVar.onDismiss();
                            }
                        }
                    } else {
                        c cVar6 = C7531x30.this.params;
                        Intrinsics.checkNotNull(cVar6);
                        maxYPos = cVar6.getOffScreenYPos();
                        C7531x30.this.dismissing = true;
                        if (C7531x30.this.mListener != null) {
                            b bVar2 = C7531x30.this.mListener;
                            Intrinsics.checkNotNull(bVar2);
                            bVar2.onDismiss();
                        }
                    }
                } else {
                    int i2 = this.lastYPos;
                    c cVar7 = C7531x30.this.params;
                    Intrinsics.checkNotNull(cVar7);
                    if (i2 >= cVar7.getDismissingYPos()) {
                        c cVar8 = C7531x30.this.params;
                        Intrinsics.checkNotNull(cVar8);
                        if (yvel < cVar8.getDismissingYVelocity()) {
                            c cVar9 = C7531x30.this.params;
                            Intrinsics.checkNotNull(cVar9);
                            maxYPos = cVar9.getOffScreenYPos();
                            C7531x30.this.dismissing = true;
                            if (C7531x30.this.mListener != null) {
                                b bVar3 = C7531x30.this.mListener;
                                Intrinsics.checkNotNull(bVar3);
                                bVar3.onDismiss();
                            }
                        }
                    } else {
                        c cVar10 = C7531x30.this.params;
                        Intrinsics.checkNotNull(cVar10);
                        maxYPos = cVar10.getOffScreenYPos();
                        C7531x30.this.dismissing = true;
                        if (C7531x30.this.mListener != null) {
                            b bVar4 = C7531x30.this.mListener;
                            Intrinsics.checkNotNull(bVar4);
                            bVar4.onDismiss();
                        }
                    }
                }
            }
            Gd2 gd2 = C7531x30.this.mDragHelper;
            Intrinsics.checkNotNull(gd2);
            c cVar11 = C7531x30.this.params;
            Intrinsics.checkNotNull(cVar11);
            if (gd2.o(cVar11.getMaxXPos(), maxYPos)) {
                C7531x30 c7531x30 = C7531x30.this;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                c7531x30.postInvalidateOnAnimation();
            }
        }

        @Override // Gd2.c
        public boolean tryCaptureView(@NotNull View child, int pointerId) {
            Intrinsics.checkNotNullParameter(child, "child");
            return true;
        }
    }

    static {
        Ie2 ie2 = Ie2.INSTANCE;
        MARGIN_PX_SIZE = ie2.dpToPx(28);
        EXTRA_PX_DISMISS = ie2.dpToPx(64);
    }

    public C7531x30(@Nullable Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        Gd2 gd2 = new Gd2(getContext(), this, new d());
        gd2.b = (int) (1.0f * gd2.b);
        this.mDragHelper = gd2;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        Gd2 gd2 = this.mDragHelper;
        Intrinsics.checkNotNull(gd2);
        if (gd2.f()) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        Gd2 gd2 = this.mDragHelper;
        Intrinsics.checkNotNull(gd2);
        int left = getLeft();
        c cVar = this.params;
        Intrinsics.checkNotNull(cVar);
        gd2.q(this, left, cVar.getOffScreenYPos());
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            Intrinsics.checkNotNull(bVar);
            bVar.onDragEnd();
        }
        Gd2 gd2 = this.mDragHelper;
        Intrinsics.checkNotNull(gd2);
        gd2.j(event);
        return false;
    }

    public final void setListener(@Nullable b listener) {
        this.mListener = listener;
    }

    public final void setParams(@NotNull c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        params.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + params.getPosY() + params.getMessageHeight() + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(Ie2.INSTANCE.dpToPx(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMaxYPos() * 2) + (params.getMessageHeight() / 3));
        } else {
            params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
            params.setDismissingYVelocity(-params.getDismissingYVelocity());
            params.setDismissingYPos(params.getOffScreenYPos() / 3);
        }
    }
}
