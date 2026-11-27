package com.jivosite.sdk.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pexpress.tool.R;
import defpackage.UK;
import defpackage.VF0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/jivosite/sdk/ui/views/JivoRatingBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "index", "", "setThumbIcon", "(I)V", "setSmileIcon", "setStarIcon", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnJivoRatingBarChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JivoRatingBar extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public int w;

    @Nullable
    public String x;

    @Nullable
    public Function1<? super String, Unit> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JivoRatingBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.g = new UK();
        this.h = 0;
        this.i = 0;
        this.j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.l = true;
        this.m = 257;
        this.n = null;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = new SparseArray<>();
        this.s = new ConstraintLayout.b(this);
        this.t = 0;
        this.u = 0;
        e(attributeSet, 0);
        this.w = 5;
    }

    private final void setSmileIcon(int index) {
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.jivo_sdk_emoji_icons);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "resources.obtainTypedArr…ray.jivo_sdk_emoji_icons)");
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) childAt;
            String str = this.x;
            if (Intrinsics.a(str, "three")) {
                appCompatImageView.setImageResource(typedArrayObtainTypedArray.getResourceId(i2 * 2, 0));
            } else if (Intrinsics.a(str, "five")) {
                appCompatImageView.setImageResource(typedArrayObtainTypedArray.getResourceId(i2, 0));
            }
            boolean z2 = true;
            if (index != -1 && index != i2) {
                z2 = false;
            }
            appCompatImageView.setSelected(z2);
        }
        typedArrayObtainTypedArray.recycle();
    }

    private final void setStarIcon(int index) {
        int i = this.w;
        int i2 = 0;
        while (i2 < i) {
            View childAt = getChildAt(i2);
            Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) childAt;
            appCompatImageView.setImageResource(R.drawable.jivo_sdk_star_rate_selector);
            appCompatImageView.setSelected(index != -1 && i2 <= index);
            i2++;
        }
    }

    private final void setThumbIcon(int index) {
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.jivo_sdk_thumb_icons);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "resources.obtainTypedArr…ray.jivo_sdk_thumb_icons)");
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.c(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) childAt;
            appCompatImageView.setImageResource(typedArrayObtainTypedArray.getResourceId(i2, 0));
            boolean z2 = true;
            if (index != -1 && index == i2) {
                z2 = false;
            }
            appCompatImageView.setSelected(z2);
        }
        typedArrayObtainTypedArray.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    public final void q(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        int i;
        int i2;
        this.x = str;
        if (Intrinsics.a(str, "two")) {
            i = 2;
        } else if (Intrinsics.a(str, "three")) {
            i = 3;
        } else {
            Intrinsics.a(str, "five");
            i = 5;
        }
        this.w = i;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (i3 >= this.w) {
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                childAt.setVisibility(4);
            } else {
                childAt.setOnClickListener(new VF0(this, i3, 0));
            }
        }
        String str4 = this.x;
        if (Intrinsics.a(str4, "two")) {
            if (Intrinsics.a(str3, "bad")) {
                i2 = 0;
            } else if (Intrinsics.a(str3, "good")) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (Intrinsics.a(str4, "three")) {
            if (Intrinsics.a(str3, "bad")) {
                i2 = 0;
            } else if (Intrinsics.a(str3, "normal")) {
                i2 = 1;
            } else if (Intrinsics.a(str3, "good")) {
                i2 = 2;
            } else {
                i2 = -1;
            }
        } else if (Intrinsics.a(str3, "bad")) {
            i2 = 0;
        } else if (Intrinsics.a(str3, "badnormal")) {
            i2 = 1;
        } else if (Intrinsics.a(str3, "normal")) {
            i2 = 2;
        } else if (Intrinsics.a(str3, "goodnormal")) {
            i2 = 3;
        } else if (Intrinsics.a(str3, "good")) {
            i2 = 4;
        } else {
            i2 = -1;
        }
        if (Intrinsics.a(str, "two")) {
            setThumbIcon(i2);
            return;
        }
        if (Intrinsics.a(str, "three")) {
            if (Intrinsics.a(str2, "smile")) {
                setSmileIcon(i2);
                return;
            } else if (Intrinsics.a(str2, "star")) {
                setStarIcon(i2);
                return;
            } else {
                if (Intrinsics.a(str2, "unknown")) {
                    setStarIcon(i2);
                    return;
                }
                return;
            }
        }
        if (!Intrinsics.a(str, "five")) {
            if (Intrinsics.a(str, "unknown")) {
                setStarIcon(i2);
            }
        } else if (Intrinsics.a(str2, "smile")) {
            setSmileIcon(i2);
        } else if (Intrinsics.a(str2, "star")) {
            setStarIcon(i2);
        } else if (Intrinsics.a(str2, "unknown")) {
            setStarIcon(i2);
        }
    }

    public final void setOnJivoRatingBarChangeListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.y = listener;
    }
}
