package defpackage;

import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: jY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4689jY1 {
    public static void a(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str != text) {
            if (str == null && text.length() == 0) {
                return;
            }
            if (!(str instanceof Spanned)) {
                if ((str == null) == (text == null)) {
                    if (str == null) {
                        return;
                    }
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (str.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void b(TextView textView, AC0 ac0) {
        TextWatcher c4431iY1 = ac0 == null ? null : new C4431iY1(ac0);
        int i = SQ0.a;
        Object tag = textView.getTag(R.id.textWatcher);
        textView.setTag(R.id.textWatcher, c4431iY1);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (c4431iY1 != null) {
            textView.addTextChangedListener(c4431iY1);
        }
    }
}
