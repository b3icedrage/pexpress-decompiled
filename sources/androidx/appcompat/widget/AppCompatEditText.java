package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.BA0;
import defpackage.C0732Ce;
import defpackage.C0810De;
import defpackage.C1901Rd;
import defpackage.C4128h50;
import defpackage.C4899kY1;
import defpackage.C5532nY1;
import defpackage.C5762oe;
import defpackage.C7211vY1;
import defpackage.C7442we;
import defpackage.CA0;
import defpackage.Cd2;
import defpackage.DA0;
import defpackage.InterfaceC4145h91;
import defpackage.N7;
import defpackage.TL;
import defpackage.TZ1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC4145h91 {
    public final C1901Rd d;
    public final C0810De e;
    public final C0732Ce g;
    public final C5532nY1 h;

    @NonNull
    public final C5762oe i;
    public a j;

    public class a {
        public a() {
        }
    }

    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // defpackage.InterfaceC4145h91
    public final TL a(@NonNull TL tl) {
        return this.h.a(this, tl);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4899kY1.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.e();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C0732Ce c0732Ce;
        if (Build.VERSION.SDK_INT >= 28 || (c0732Ce = this.g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0732Ce.b;
        return textClassifier == null ? C0732Ce.a.a(c0732Ce.a) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        int i;
        String[] strArrF;
        String[] stringArray;
        InputConnection da0;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.e.getClass();
        C0810De.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        N7.s(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrF = Cd2.f(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrF;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrF);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrF);
            }
            BA0 ba0 = new BA0(this);
            if (i >= 25) {
                da0 = new CA0(inputConnectionOnCreateInputConnection, ba0);
            } else {
                String[] strArr = C4128h50.a;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    da0 = new DA0(inputConnectionOnCreateInputConnection, ba0);
                }
            }
            inputConnectionOnCreateInputConnection = da0;
        }
        return this.i.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && Cd2.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = C7442we.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        TL.b aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || Cd2.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                aVar = new TL.a(primaryClip, 1);
            } else {
                TL.c cVar = new TL.c();
                cVar.a = primaryClip;
                cVar.b = 1;
                aVar = cVar;
            }
            aVar.b(i == 16908322 ? 0 : 1);
            Cd2.h(this, aVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4899kY1.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.i.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.i.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0810De c0810De = this.e;
        c0810De.l(colorStateList);
        c0810De.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0810De c0810De = this.e;
        c0810De.m(mode);
        c0810De.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0810De c0810De = this.e;
        if (c0810De != null) {
            c0810De.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0732Ce c0732Ce;
        if (Build.VERSION.SDK_INT >= 28 || (c0732Ce = this.g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0732Ce.b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        TZ1.a(context);
        C7211vY1.a(this, getContext());
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, R.attr.editTextStyle);
        C0810De c0810De = new C0810De(this);
        this.e = c0810De;
        c0810De.f(attributeSet, R.attr.editTextStyle);
        c0810De.b();
        C0732Ce c0732Ce = new C0732Ce();
        c0732Ce.a = this;
        this.g = c0732Ce;
        this.h = new C5532nY1();
        C5762oe c5762oe = new C5762oe(this);
        this.i = c5762oe;
        c5762oe.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c5762oe.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
