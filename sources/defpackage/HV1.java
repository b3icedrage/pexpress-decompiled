package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface HV1 extends MenuItem {
    @NonNull
    HV1 a(AbstractC7327w5 abstractC7327w5);

    AbstractC7327w5 b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    HV1 setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    @NonNull
    HV1 setTooltipText(CharSequence charSequence);
}
