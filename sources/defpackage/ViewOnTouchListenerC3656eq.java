package defpackage;

import android.animation.Animator;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC3656eq extends LinearLayout implements View.OnTouchListener {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    @Nullable
    public Animation d;

    @Nullable
    public ViewGroup e;

    @Nullable
    public TextView g;

    @Nullable
    public TextView h;

    @Nullable
    public ImageView i;

    @Nullable
    public TextView j;
    public long k;
    public int l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;

    @Nullable
    public InterfaceC4286hq w;
    public boolean x;
    public boolean y;

    @NotNull
    public Handler z;

    /* JADX INFO: renamed from: eq$a */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewOnTouchListenerC3656eq.this.c(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    private final Animator.AnimatorListener getDestroyListener() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDismissType() {
        if (this.x) {
            return 2;
        }
        return this.y ? 0 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setParams$lambda$1(ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq) {
        viewOnTouchListenerC3656eq.y = true;
        viewOnTouchListenerC3656eq.c(null);
    }

    public final void c(@Nullable C3665et c3665et) {
        this.A = true;
        this.z.removeCallbacksAndMessages(null);
        if (c3665et != null) {
            this.w = c3665et;
        }
        if (!this.p) {
            Animation animation = this.d;
            Intrinsics.checkNotNull(animation);
            animation.setAnimationListener(new AnimationAnimationListenerC3866fq(this));
            post(new RunnableC3446dq(this, 0));
            return;
        }
        this.z.postDelayed(new RunnableC2818aq(this, 0), 200L);
        InterfaceC4286hq interfaceC4286hq = this.w;
        if (interfaceC4286hq != null) {
            Intrinsics.checkNotNull(interfaceC4286hq);
            interfaceC4286hq.onDismiss();
        }
    }

    @Nullable
    public final InterfaceC4286hq getDismissListener() {
        return this.w;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.o = width;
        this.n = width / 6;
        if (this.l != 48) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        ViewGroup viewGroup = this.e;
        Intrinsics.checkNotNull(viewGroup);
        super.onLayout(z, i, 0, i3, viewGroup.getMeasuredHeight());
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.v) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.m = motionEvent.getRawX();
                return true;
            }
            long j = 200;
            float f = 0.0f;
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                if (!this.p) {
                    float rawX = motionEvent.getRawX() - this.m;
                    float fAbs = 1 - Math.abs(rawX / this.o);
                    if (Math.abs(rawX) > this.n) {
                        rawX = Math.signum(rawX) * this.o;
                        this.p = true;
                    } else {
                        j = 0;
                        f = fAbs;
                    }
                    view.animate().setListener(this.p ? getDestroyListener() : null).x(rawX).alpha(f).setDuration(j).start();
                    return true;
                }
            } else if (!this.p) {
                view.animate().x(0.0f).alpha(1.0f).setDuration(200L).start();
            }
        }
        return true;
    }

    public final void setDismissListener(@Nullable InterfaceC4286hq interfaceC4286hq) {
        this.w = interfaceC4286hq;
    }

    public final void setParams(@NotNull C4076gq.a params) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(params, "params");
        int i = params.h;
        if (i != 0) {
            View.inflate(getContext(), i, this);
        } else {
            View.inflate(getContext(), R.layout.layout_banner, this);
        }
        if (getChildAt(0).getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
            Intrinsics.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        this.e = (ViewGroup) findViewById(R.id.cookie);
        this.g = (TextView) findViewById(R.id.tv_title);
        this.h = (TextView) findViewById(R.id.tv_message);
        this.i = (ImageView) findViewById(R.id.iv_icon);
        TextView textView = (TextView) findViewById(R.id.btn_action);
        this.j = textView;
        if (i == 0 && (this.e == null || this.g == null || this.h == null || this.i == null || textView == null)) {
            throw new RuntimeException("Your custom cookie view is missing one of the default required views");
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(this);
        }
        this.k = 2000L;
        this.l = 48;
        this.q = params.i;
        this.r = params.j;
        this.s = params.k;
        this.t = params.l;
        this.v = params.c;
        this.u = params.d;
        this.w = null;
        final C6634sm0 c6634sm0 = params.m;
        if (params.e != 0 && (imageView = this.i) != null) {
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            ImageView imageView2 = this.i;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setBackgroundResource(params.e);
        }
        if (this.g != null && !TextUtils.isEmpty(null)) {
            TextView textView2 = this.g;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(0);
            TextView textView3 = this.g;
            Intrinsics.checkNotNull(textView3);
            textView3.setText((CharSequence) null);
        }
        if (this.h != null && !TextUtils.isEmpty(params.a)) {
            TextView textView4 = this.h;
            Intrinsics.checkNotNull(textView4);
            textView4.setVisibility(0);
            TextView textView5 = this.h;
            Intrinsics.checkNotNull(textView5);
            textView5.setText(params.a);
            if (params.f != 0) {
                TextView textView6 = this.h;
                Intrinsics.checkNotNull(textView6);
                textView6.setTextColor(C6333rM.getColor(getContext(), params.f));
            }
        }
        if (this.j != null && !TextUtils.isEmpty(params.b) && c6634sm0 != null) {
            TextView textView7 = this.j;
            Intrinsics.checkNotNull(textView7);
            textView7.setVisibility(0);
            TextView textView8 = this.j;
            Intrinsics.checkNotNull(textView8);
            textView8.setText(params.b);
            TextView textView9 = this.j;
            Intrinsics.checkNotNull(textView9);
            textView9.setOnClickListener(new View.OnClickListener() { // from class: bq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6062q31 c6062q31 = (C6062q31) c6634sm0.e;
                    c6062q31.getClass();
                    C5189lv.k(C3286d41.a, null, new D31(c6062q31, null), 3);
                    ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = this;
                    viewOnTouchListenerC3656eq.x = true;
                    viewOnTouchListenerC3656eq.c(null);
                }
            });
            if (params.g != 0) {
                TextView textView10 = this.j;
                Intrinsics.checkNotNull(textView10);
                textView10.setTextColor(C6333rM.getColor(getContext(), params.g));
            }
        }
        setAnimation(AnimationUtils.loadAnimation(getContext(), this.l == 80 ? this.r : this.q));
        this.d = AnimationUtils.loadAnimation(getContext(), this.l == 80 ? this.t : this.s);
        if (this.u) {
            this.z.postDelayed(new RunnableC3237cq(this, 0), this.k);
        }
    }

    public final void setRemovalInProgress(boolean z) {
        this.A = z;
    }
}
