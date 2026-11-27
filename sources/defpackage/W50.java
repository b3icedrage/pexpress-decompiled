package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class W50 implements TextWatcher {
    public final EditText d;
    public a e;
    public boolean g = true;

    public static class a extends c.d {
        public final WeakReference a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.d
        public final void b() {
            W50.a((EditText) this.a.get(), 1);
        }
    }

    public W50(EditText editText) {
        this.d = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            c cVarA = c.a();
            if (editableText == null) {
                length = 0;
            } else {
                cVarA.getClass();
                length = editableText.length();
            }
            cVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.d;
        if (editText.isInEditMode() || !this.g || c.j == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = c.a().b();
        if (iB != 0) {
            if (iB == 1) {
                c.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        c cVarA = c.a();
        if (this.e == null) {
            this.e = new a(editText);
        }
        cVarA.f(this.e);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
