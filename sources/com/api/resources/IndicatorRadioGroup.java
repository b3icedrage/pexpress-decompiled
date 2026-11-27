package com.api.resources;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.Id2;
import defpackage.R51;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/api/resources/IndicatorRadioGroup;", "Landroid/widget/LinearLayout;", "", "id", "", "setCheckedId", "(I)V", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "", "enabled", "setEnabled", "(Z)V", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorRadioGroup extends LinearLayout {
    public int d;
    public boolean e;

    @Nullable
    public final b g;

    @Nullable
    public final a h;

    public final class a implements com.api.resources.a.InterfaceC0272a {
        public a() {
        }

        @Override // com.api.resources.a.InterfaceC0272a
        public final void a(@NotNull com.api.resources.a view, boolean z) {
            View viewFindViewById;
            Intrinsics.checkNotNullParameter(view, "view");
            IndicatorRadioGroup indicatorRadioGroup = IndicatorRadioGroup.this;
            if (indicatorRadioGroup.e) {
                return;
            }
            indicatorRadioGroup.e = true;
            int i = indicatorRadioGroup.d;
            if (i != -1 && (viewFindViewById = indicatorRadioGroup.findViewById(i)) != null && (viewFindViewById instanceof RadioIndicatorButton)) {
                ((RadioIndicatorButton) viewFindViewById).setChecked(false);
            }
            indicatorRadioGroup.e = false;
            indicatorRadioGroup.setCheckedId(view.getId());
        }
    }

    public final class b implements ViewGroup.OnHierarchyChangeListener {

        @Nullable
        public ViewGroup.OnHierarchyChangeListener d;

        public b() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(@NotNull View parent, @NotNull View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            IndicatorRadioGroup indicatorRadioGroup = IndicatorRadioGroup.this;
            if (parent == indicatorRadioGroup && (child instanceof RadioIndicatorButton)) {
                RadioIndicatorButton radioIndicatorButton = (RadioIndicatorButton) child;
                if (radioIndicatorButton.getId() == -1) {
                    radioIndicatorButton.setId(View.generateViewId());
                }
                a onCheckedChangeListener = indicatorRadioGroup.h;
                if (onCheckedChangeListener != null) {
                    Intrinsics.checkNotNullParameter(onCheckedChangeListener, "onCheckedChangeListener");
                    radioIndicatorButton.y.add(onCheckedChangeListener);
                }
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(@NotNull View parent, @NotNull View child) {
            a onCheckedChangeListener;
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            IndicatorRadioGroup indicatorRadioGroup = IndicatorRadioGroup.this;
            if (parent == indicatorRadioGroup && (child instanceof RadioIndicatorButton) && (onCheckedChangeListener = indicatorRadioGroup.h) != null) {
                RadioIndicatorButton radioIndicatorButton = (RadioIndicatorButton) child;
                radioIndicatorButton.getClass();
                Intrinsics.checkNotNullParameter(onCheckedChangeListener, "onCheckedChangeListener");
                radioIndicatorButton.y.remove(onCheckedChangeListener);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorRadioGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = -1;
        this.h = new a();
        b bVar = new b();
        this.g = bVar;
        super.setOnHierarchyChangeListener(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedId(int id) {
        this.d = id;
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        View viewFindViewById;
        if (view instanceof RadioIndicatorButton) {
            RadioIndicatorButton radioIndicatorButton = (RadioIndicatorButton) view;
            if (radioIndicatorButton.z) {
                this.e = true;
                int i2 = this.d;
                if (i2 != -1 && (viewFindViewById = findViewById(i2)) != null && (viewFindViewById instanceof RadioIndicatorButton)) {
                    ((RadioIndicatorButton) viewFindViewById).setChecked(false);
                }
                this.e = false;
                setCheckedId(radioIndicatorButton.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.d;
        if (i != -1) {
            this.e = true;
            View viewFindViewById = findViewById(i);
            if (viewFindViewById != null && (viewFindViewById instanceof RadioIndicatorButton)) {
                ((RadioIndicatorButton) viewFindViewById).setChecked(true);
            }
            this.e = false;
            setCheckedId(this.d);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<View> it = new Id2(this).iterator();
        while (it.hasNext()) {
            it.next().setEnabled(enabled);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(@NotNull ViewGroup.OnHierarchyChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        b bVar = this.g;
        if (bVar != null) {
            bVar.d = listener;
        }
    }
}
