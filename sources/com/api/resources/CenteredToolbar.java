package com.api.resources;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/api/resources/CenteredToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/widget/TextView;", "getCenteredTitleTextView", "()Landroid/widget/TextView;", "", "resId", "", "setTitle", "(I)V", "", "title", "(Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "Landroid/graphics/Typeface;", "font", "setTypeface", "(Landroid/graphics/Typeface;)V", "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CenteredToolbar extends Toolbar {

    @Nullable
    public TextView b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getCenteredTitleTextView() {
        TextView textView = this.b0;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(getContext());
        this.b0 = textView2;
        Intrinsics.checkNotNull(textView2);
        textView2.setSingleLine();
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextAppearance(com.pexpress.tool.R.style.H4_Bold);
        textView2.setTypeface(Typeface.DEFAULT_BOLD, 1);
        Toolbar.g gVar = new Toolbar.g();
        gVar.a = 17;
        textView2.setLayoutParams(gVar);
        addView(this.b0);
        return this.b0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    @NotNull
    public CharSequence getTitle() {
        TextView centeredTitleTextView = getCenteredTitleTextView();
        return String.valueOf(centeredTitleTextView != null ? centeredTitleTextView.getText() : null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int resId) {
        String string = getResources().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setTitle(string);
    }

    public final void setTypeface(@Nullable Typeface font) {
        TextView centeredTitleTextView = getCenteredTitleTextView();
        if (centeredTitleTextView != null) {
            centeredTitleTextView.setTypeface(font);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView centeredTitleTextView = getCenteredTitleTextView();
        if (centeredTitleTextView != null) {
            centeredTitleTextView.setText(title);
        }
    }
}
