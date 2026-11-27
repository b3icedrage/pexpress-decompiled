package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.pexpress.tool.R;
import defpackage.C3855fm1;
import defpackage.C5345me2;
import defpackage.Cd2;
import defpackage.WZ1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public h d;
    public ImageView e;
    public RadioButton g;
    public TextView h;
    public CheckBox i;
    public TextView j;
    public ImageView k;
    public ImageView l;
    public LinearLayout m;
    public final Drawable n;
    public final int o;
    public final Context p;
    public boolean q;
    public final Drawable r;
    public final boolean s;
    public LayoutInflater t;
    public boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WZ1 wz1E = WZ1.e(getContext(), attributeSet, C3855fm1.r, R.attr.listMenuViewStyle);
        this.n = wz1E.b(5);
        TypedArray typedArray = wz1E.b;
        this.o = typedArray.getResourceId(1, -1);
        this.q = typedArray.getBoolean(7, false);
        this.p = context;
        this.r = wz1E.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.s = typedArrayObtainStyledAttributes.hasValue(0);
        wz1E.f();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
        rect.top = this.l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.d = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.e);
        setCheckable(hVar.isCheckable());
        if (hVar.n.o()) {
            if ((hVar.n.n() ? hVar.j : hVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        hVar.n.n();
        if (z) {
            h hVar2 = this.d;
            if (hVar2.n.o()) {
                if ((hVar2.n.n() ? hVar2.j : hVar2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.j;
            h hVar3 = this.d;
            char c = hVar3.n.n() ? hVar3.j : hVar3.h;
            if (c == 0) {
                string = "";
            } else {
                f fVar = hVar3.n;
                Resources resources = fVar.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(fVar.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = fVar.n() ? hVar3.k : hVar3.i;
                h.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                h.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                h.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                h.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                h.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                h.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setBackground(this.n);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i = this.o;
        if (i != -1) {
            textView.setTextAppearance(this.p, i);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.l = (ImageView) findViewById(R.id.group_divider);
        this.m = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.g == null && this.i == null) {
            return;
        }
        if ((this.d.x & 4) != 0) {
            if (this.g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.g = radioButton;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.g;
            view = this.i;
        } else {
            if (this.i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.i = checkBox;
                LinearLayout linearLayout2 = this.m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.i;
            view = this.g;
        }
        if (z) {
            compoundButton.setChecked(this.d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.i;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.d.x & 4) != 0) {
            if (this.g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.g = radioButton;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.g;
        } else {
            if (this.i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.i = checkBox;
                LinearLayout linearLayout2 = this.m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.d.n.getClass();
        boolean z = this.u;
        if (z || this.q) {
            ImageView imageView = this.e;
            if (imageView == null && drawable == null && !this.q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.e = imageView2;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.q) {
                this.e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.e;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.h.getVisibility() != 8) {
                this.h.setVisibility(8);
            }
        } else {
            this.h.setText(charSequence);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        }
    }
}
