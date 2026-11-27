package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes.dex */
public final class YB extends Property<ViewGroup, Float> {
    public static final YB a = new YB(Float.class, "childrenAlpha");

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        ViewGroup viewGroup2 = viewGroup;
        Float f2 = f;
        float fFloatValue = f2.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f2);
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
