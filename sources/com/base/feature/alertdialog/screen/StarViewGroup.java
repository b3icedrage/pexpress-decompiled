package com.base.feature.alertdialog.screen;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pexpress.tool.R;
import defpackage.C5729oU0;
import defpackage.CallableC5519nU0;
import defpackage.DU0;
import defpackage.Id2;
import defpackage.Jd2;
import defpackage.QK;
import defpackage.RunnableC3117cG0;
import defpackage.VF0;
import defpackage.WE;
import defpackage.YE1;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/base/feature/alertdialog/screen/StarViewGroup;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "", "onSelectStarAction", "setupView", "(Lkotlin/jvm/functions/Function1;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "e", "I", "setSelectedStarIndex", "(I)V", "selectedStarIndex", "getStarCount", "()I", "starCount", "getOptionalStarCount", "()Ljava/lang/Integer;", "optionalStarCount", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StarViewGroup extends LinearLayout {
    public static final /* synthetic */ int i = 0;

    @NotNull
    public final Context d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int selectedStarIndex;

    @NotNull
    public Function1<? super Boolean, Unit> g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
        this.selectedStarIndex = -1;
        this.g = new YE1(2);
        this.h = R.raw.star_selection_anim;
        setOrientation(0);
        String strI = C5729oU0.i(context, R.raw.star_selection_anim);
        C5729oU0.a(strI, new CallableC5519nU0(new WeakReference(context), context.getApplicationContext(), R.raw.star_selection_anim, strI));
    }

    public static void a(StarViewGroup starViewGroup, int i2) {
        starViewGroup.setSelectedStarIndex(i2);
    }

    private final void setSelectedStarIndex(int i2) {
        if (this.selectedStarIndex == i2) {
            i2--;
        }
        this.selectedStarIndex = i2;
        Iterator<View> it = new Id2(this).iterator();
        int i3 = 0;
        while (true) {
            Jd2 jd2 = (Jd2) it;
            if (!jd2.hasNext()) {
                this.g.invoke(Boolean.valueOf(this.selectedStarIndex != -1));
                return;
            }
            Object next = jd2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                WE.l();
                throw null;
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) next);
            boolean zIsSelected = lottieAnimationView.isSelected();
            int i5 = this.selectedStarIndex;
            LottieAnimationView.c cVar = LottieAnimationView.c.j;
            DU0 du0 = lottieAnimationView.l;
            HashSet hashSet = lottieAnimationView.r;
            if (i3 <= i5) {
                if (!zIsSelected) {
                    lottieAnimationView.setSelected(true);
                    lottieAnimationView.setSpeed(1.0f);
                    hashSet.add(cVar);
                    du0.l();
                }
            } else if (zIsSelected) {
                lottieAnimationView.setSelected(false);
                lottieAnimationView.setProgress(0.5f);
                lottieAnimationView.setSpeed(-1.5f);
                hashSet.add(cVar);
                du0.n();
            }
            i3 = i4;
        }
    }

    @Nullable
    public final Integer getOptionalStarCount() {
        Integer numValueOf = Integer.valueOf(getStarCount());
        if (this.selectedStarIndex != -1) {
            return numValueOf;
        }
        return null;
    }

    public final int getStarCount() {
        return this.selectedStarIndex + 1;
    }

    public final void setupView(@NotNull Function1<? super Boolean, Unit> onSelectStarAction) {
        Intrinsics.checkNotNullParameter(onSelectStarAction, "onSelectStarAction");
        this.g = onSelectStarAction;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(this.d);
            lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams((int) lottieAnimationView.getResources().getDimension(R.dimen.rate_app_dialog_star_size), (int) lottieAnimationView.getResources().getDimension(R.dimen.rate_app_dialog_star_size), 1.0f));
            lottieAnimationView.setImageResource(R.drawable.ic_blank_star);
            lottieAnimationView.setOnClickListener(new VF0(this, i3, 1));
            lottieAnimationView.setAnimation(this.h);
            addView(lottieAnimationView);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        Iterator<View> it = new Id2(this).iterator();
        while (true) {
            Jd2 jd2 = (Jd2) it;
            if (!jd2.hasNext()) {
                return;
            }
            Object next = jd2.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                WE.l();
                throw null;
            }
            View view = (View) next;
            handler.postDelayed(new RunnableC3117cG0(2, this, view), ((long) i2) * 250);
            handler.postDelayed(new QK(2, this, view), (((long) (5 - i2)) * 250) + 1500);
            i2 = i4;
        }
    }
}
