package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3662es implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C3243cs e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final C3243cs h;

    @NonNull
    public final C3452ds i;

    @NonNull
    public final C3243cs j;

    @NonNull
    public final C3243cs k;

    @NonNull
    public final ImageView l;

    @NonNull
    public final TextView m;

    public C3662es(@NonNull ConstraintLayout constraintLayout, @NonNull C3243cs c3243cs, @NonNull MaterialButton materialButton, @NonNull C3243cs c3243cs2, @NonNull C3452ds c3452ds, @NonNull C3243cs c3243cs3, @NonNull C3243cs c3243cs4, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.d = constraintLayout;
        this.e = c3243cs;
        this.g = materialButton;
        this.h = c3243cs2;
        this.i = c3452ds;
        this.j = c3243cs3;
        this.k = c3243cs4;
        this.l = imageView;
        this.m = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
