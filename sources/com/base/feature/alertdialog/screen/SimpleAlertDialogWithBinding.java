package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.api.feature.alertdialog.screens.AlertDialogWithBinding;
import defpackage.InterfaceC7441wd2;
import defpackage.TF;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lwd2;", "VB", "Lcom/api/feature/alertdialog/screens/AlertDialogWithBinding;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleAlertDialogWithBinding<VB extends InterfaceC7441wd2> extends AlertDialogWithBinding<VB> {

    @NotNull
    public final TF g;

    public SimpleAlertDialogWithBinding(@NotNull TF dialogData) {
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.g = dialogData;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void k(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        TF tf = this.g;
        dialog.setCanceledOnTouchOutside(tf.n);
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        setCancelable(tf.o);
    }

    @NotNull
    public final String l(int i) {
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TF tf = this.g;
        List<? extends Object> list = tf.e;
        if (list == null) {
            return string;
        }
        Intrinsics.checkNotNull(list);
        if (list.isEmpty()) {
            return string;
        }
        List<? extends Object> list2 = tf.e;
        Intrinsics.checkNotNull(list2);
        String[] strArrN = n(list2);
        Object[] objArrCopyOf = Arrays.copyOf(strArrN, strArrN.length);
        String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String m(int i) {
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TF tf = this.g;
        List<? extends Object> list = tf.b;
        if (list == null) {
            return string;
        }
        Intrinsics.checkNotNull(list);
        if (list.isEmpty()) {
            return string;
        }
        List<? extends Object> list2 = tf.b;
        Intrinsics.checkNotNull(list2);
        String[] strArrN = n(list2);
        Object[] objArrCopyOf = Arrays.copyOf(strArrN, strArrN.length);
        String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String[] n(List<? extends Object> list) {
        if (list.isEmpty()) {
            return new String[0];
        }
        if (CollectionsKt.F(list) instanceof Integer) {
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            for (Object obj : list) {
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                arrayList.add(getString(((Integer) obj).intValue()));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
        for (Object obj2 : list) {
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((String) obj2);
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.g.k.invoke();
    }
}
