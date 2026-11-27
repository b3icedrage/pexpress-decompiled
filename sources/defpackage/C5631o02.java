package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: renamed from: o02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5631o02 {
    public static final a a = new a();

    /* JADX INFO: renamed from: o02$a */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ArrayList a(@NonNull MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
