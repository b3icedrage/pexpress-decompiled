package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CheckableImageView;
import com.pexpress.tool.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LPx0;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "enabled", "", "setEnabled", "(Z)V", "LQx0;", "w", "LQx0;", "getBinding", "()LQx0;", "binding", "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class C1806Px0 extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final C1884Qx0 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1806Px0(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final C1884Qx0 getBinding() {
        return this.binding;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<View> it = new Id2(this).iterator();
        while (it.hasNext()) {
            it.next().setEnabled(enabled);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806Px0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.indicator_button, this);
        int i2 = R.id.icon;
        CheckableImageView checkableImageView = (CheckableImageView) C3476e.h(this, R.id.icon);
        if (checkableImageView != null) {
            i2 = R.id.label;
            CheckedTextView checkedTextView = (CheckedTextView) C3476e.h(this, R.id.label);
            if (checkedTextView != null) {
                C1884Qx0 c1884Qx0 = new C1884Qx0(this, checkableImageView, checkedTextView);
                Intrinsics.checkNotNullExpressionValue(c1884Qx0, "inflate(...)");
                this.binding = c1884Qx0;
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3645em1.a, 0, 0);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, isEnabled()));
                checkableImageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(2));
                checkedTextView.setText(typedArrayObtainStyledAttributes.getText(1));
                Unit unit = Unit.a;
                typedArrayObtainStyledAttributes.recycle();
                setBackground(C6333rM.getDrawable(context, R.drawable.background_selector));
                checkedTextView.setTextColor(C6333rM.getColorStateList(context, R.color.text_color_selector));
                setClickable(true);
                setFocusable(true);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }
}
