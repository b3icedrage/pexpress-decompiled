package com.api.resources;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import defpackage.C1806Px0;
import defpackage.C3645em1;
import defpackage.C6333rM;
import defpackage.C7439wd0;
import defpackage.Id2;
import defpackage.JH1;
import defpackage.MB;
import defpackage.R51;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/api/resources/a;", "LPx0;", "Landroid/widget/Checkable;", "", "checked", "", "setChecked", "(Z)V", "Landroid/widget/CheckedTextView;", "x", "Landroid/widget/CheckedTextView;", "getText", "()Landroid/widget/CheckedTextView;", "text", R51.PUSH_ADDITIONAL_DATA_KEY, "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a extends C1806Px0 implements Checkable {

    @NotNull
    public static final int[] A = {R.attr.state_checked};

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final CheckedTextView text;

    @NotNull
    public final ArrayList y;
    public boolean z;

    /* JADX INFO: renamed from: com.api.resources.a$a, reason: collision with other inner class name */
    public interface InterfaceC0272a {
        void a(@NotNull a aVar, boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final CheckedTextView getText() {
        return this.text;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.z != checked) {
            this.z = checked;
            C7439wd0.a aVar = new C7439wd0.a(JH1.h(new Id2(this), new MB(0)));
            while (aVar.hasNext()) {
                KeyEvent.Callback callback = (View) aVar.next();
                Intrinsics.c(callback, "null cannot be cast to non-null type android.widget.Checkable");
                ((Checkable) callback).setChecked(checked);
            }
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((InterfaceC0272a) it.next()).a(this, this.z);
            }
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.y = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3645em1.a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setChecked(typedArrayObtainStyledAttributes.getBoolean(0, this.z));
        Unit unit = Unit.a;
        typedArrayObtainStyledAttributes.recycle();
        setBackground(C6333rM.getDrawable(context, com.pexpress.tool.R.drawable.checkable_background_selector));
        getBinding().e.setImageTintList(C6333rM.getColorStateList(context, com.pexpress.tool.R.color.checkable_color_selector));
        this.text = getBinding().g;
        getBinding().g.setTextColor(C6333rM.getColorStateList(context, com.pexpress.tool.R.color.checkable_color_selector));
    }
}
