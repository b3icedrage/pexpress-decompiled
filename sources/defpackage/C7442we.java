package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7442we {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        TL.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new TL.a(clipData, 3);
            } else {
                TL.c cVar = new TL.c();
                cVar.a = clipData;
                cVar.b = 3;
                aVar = cVar;
            }
            Cd2.h(textView, aVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        TL.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new TL.a(clipData, 3);
        } else {
            TL.c cVar = new TL.c();
            cVar.a = clipData;
            cVar.b = 3;
            aVar = cVar;
        }
        Cd2.h(view, aVar.build());
        return true;
    }
}
