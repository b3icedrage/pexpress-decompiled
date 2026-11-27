package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0732Ce {

    @NonNull
    public TextView a;
    public TextClassifier b;

    /* JADX INFO: renamed from: Ce$a */
    public static final class a {
        @NonNull
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
