package com.jivosite.sdk;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.jivosite.sdk.ui.views.ExpandableTextView;
import com.pexpress.tool.R;
import defpackage.A00;
import defpackage.AbstractC4879kS;
import defpackage.C00;
import defpackage.C5146li0;
import defpackage.C6468s00;
import defpackage.C6888u00;
import defpackage.C7308w00;
import defpackage.C7729y00;
import defpackage.E00;
import defpackage.FK;
import defpackage.G00;
import defpackage.I00;
import defpackage.InterfaceC5089lS;
import defpackage.K00;
import defpackage.M00;
import defpackage.O00;
import defpackage.V31;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends AbstractC4879kS {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.dg_item_agent_file, 1);
        sparseIntArray.put(R.layout.dg_item_agent_image, 2);
        sparseIntArray.put(R.layout.dg_item_agent_text, 3);
        sparseIntArray.put(R.layout.dg_item_client_file, 4);
        sparseIntArray.put(R.layout.dg_item_client_image, 5);
        sparseIntArray.put(R.layout.dg_item_client_text, 6);
        sparseIntArray.put(R.layout.dg_item_contact_form, 7);
        sparseIntArray.put(R.layout.dg_item_event, 8);
        sparseIntArray.put(R.layout.dg_item_rating, 9);
        sparseIntArray.put(R.layout.dg_item_unsupported, 10);
        sparseIntArray.put(R.layout.dg_item_uploading_file, 11);
        sparseIntArray.put(R.layout.dg_item_uploading_image, 12);
        sparseIntArray.put(R.layout.fragment_jivo_chat, 13);
    }

    @Override // defpackage.AbstractC4879kS
    public final List<AbstractC4879kS> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.AbstractC4879kS
    public final ViewDataBinding b(InterfaceC5089lS interfaceC5089lS, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/dg_item_agent_file_0".equals(tag)) {
                        return new C6468s00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_agent_file is invalid. Received: "));
                case 2:
                    if ("layout/dg_item_agent_image_0".equals(tag)) {
                        return new C6888u00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_agent_image is invalid. Received: "));
                case 3:
                    if ("layout/dg_item_agent_text_0".equals(tag)) {
                        return new C7308w00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_agent_text is invalid. Received: "));
                case 4:
                    if ("layout/dg_item_client_file_0".equals(tag)) {
                        return new C7729y00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_client_file is invalid. Received: "));
                case 5:
                    if ("layout/dg_item_client_image_0".equals(tag)) {
                        return new A00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_client_image is invalid. Received: "));
                case 6:
                    if ("layout/dg_item_client_text_0".equals(tag)) {
                        return new C00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_client_text is invalid. Received: "));
                case 7:
                    if ("layout/dg_item_contact_form_0".equals(tag)) {
                        return new E00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_contact_form is invalid. Received: "));
                case 8:
                    if (!"layout/dg_item_event_0".equals(tag)) {
                        throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_event is invalid. Received: "));
                    }
                    G00 g00 = new G00(interfaceC5089lS, view, (AppCompatTextView) ViewDataBinding.s(view, 1, null)[0]);
                    g00.B = -1L;
                    g00.y.setTag(null);
                    view.setTag(R.id.dataBinding, g00);
                    synchronized (g00) {
                        g00.B = 16L;
                        break;
                    }
                    g00.v();
                    return g00;
                case 9:
                    if ("layout/dg_item_rating_0".equals(tag)) {
                        return new I00(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_rating is invalid. Received: "));
                case 10:
                    if (!"layout/dg_item_unsupported_0".equals(tag)) {
                        throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_unsupported is invalid. Received: "));
                    }
                    Object[] objArrS = ViewDataBinding.s(view, 4, K00.D);
                    ExpandableTextView expandableTextView = (ExpandableTextView) objArrS[1];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrS[0];
                    K00 k00 = new K00(interfaceC5089lS, view, expandableTextView, constraintLayout);
                    k00.C = -1L;
                    k00.y.setTag(null);
                    k00.z.setTag(null);
                    view.setTag(R.id.dataBinding, k00);
                    synchronized (k00) {
                        k00.C = 8L;
                        break;
                    }
                    k00.v();
                    return k00;
                case 11:
                    if (!"layout/dg_item_uploading_file_0".equals(tag)) {
                        throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_uploading_file is invalid. Received: "));
                    }
                    Object[] objArrS2 = ViewDataBinding.s(view, 8, M00.H);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) objArrS2[3];
                    M00 m00 = new M00(interfaceC5089lS, view, appCompatTextView, (ShapeableImageView) objArrS2[2], (ProgressBar) objArrS2[1], (AppCompatImageView) objArrS2[6], (TextView) objArrS2[5], (AppCompatTextView) objArrS2[4]);
                    m00.G = -1L;
                    m00.y.setTag(null);
                    ((LinearLayout) objArrS2[0]).setTag(null);
                    m00.z.setTag(null);
                    m00.A.setTag(null);
                    m00.B.setTag(null);
                    m00.C.setTag(null);
                    m00.D.setTag(null);
                    m00.y(view);
                    synchronized (m00) {
                        m00.G = 64L;
                        break;
                    }
                    m00.v();
                    return m00;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!"layout/dg_item_uploading_image_0".equals(tag)) {
                        throw new IllegalArgumentException(FK.c(tag, "The tag for dg_item_uploading_image is invalid. Received: "));
                    }
                    Object[] objArrS3 = ViewDataBinding.s(view, 7, O00.C);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrS3[1];
                    O00 o00 = new O00(interfaceC5089lS, view, constraintLayout2);
                    o00.B = -1L;
                    ((ConstraintLayout) objArrS3[0]).setTag(null);
                    o00.y.setTag(null);
                    o00.y(view);
                    synchronized (o00) {
                        o00.B = 8L;
                        break;
                    }
                    o00.v();
                    return o00;
                case 13:
                    if ("layout/fragment_jivo_chat_0".equals(tag)) {
                        return new C5146li0(interfaceC5089lS, view);
                    }
                    throw new IllegalArgumentException(FK.c(tag, "The tag for fragment_jivo_chat is invalid. Received: "));
            }
        }
        return null;
    }
}
