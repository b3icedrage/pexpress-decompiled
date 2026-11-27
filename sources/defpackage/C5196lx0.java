package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: lx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b*\u0002Ñ\u0001\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u009f\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u0002022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010;\u001a\u0002022\u0006\u00106\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u0002022\u0006\u00106\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010B\u001a\u0002022\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u0002022\u0006\u0010D\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u0002022\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u0002022\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010JJ\u001f\u0010L\u001a\u0002022\u0006\u0010H\u001a\u00020G2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u000202H\u0016¢\u0006\u0004\bN\u00104J\u000f\u0010O\u001a\u000202H\u0016¢\u0006\u0004\bO\u00104J\u0017\u0010R\u001a\u0002022\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ#\u0010V\u001a\u0002022\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020@0TH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010Z\u001a\u0002022\u0006\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020@H\u0016¢\u0006\u0004\bZ\u0010[J\u001d\u0010^\u001a\u0002022\f\u0010]\u001a\b\u0012\u0004\u0012\u00020@0\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u0002022\u0006\u0010X\u001a\u00020@H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u000202H\u0016¢\u0006\u0004\bb\u00104J\u0017\u0010e\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bg\u0010fJ\u001f\u0010j\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010l\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bl\u0010kJ\u001f\u0010o\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bq\u0010fJ\u0017\u0010r\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\br\u0010fJ\u0017\u0010t\u001a\u0002022\u0006\u0010s\u001a\u00020@H\u0016¢\u0006\u0004\bt\u0010aJ\u0017\u0010u\u001a\u0002022\u0006\u0010s\u001a\u00020@H\u0016¢\u0006\u0004\bu\u0010aJ\u0017\u0010w\u001a\u0002022\u0006\u0010v\u001a\u00020@H\u0016¢\u0006\u0004\bw\u0010aJ\u0017\u0010z\u001a\u0002022\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u000202H\u0016¢\u0006\u0004\b|\u00104J\u000f\u0010}\u001a\u000202H\u0002¢\u0006\u0004\b}\u00104J\u001e\u0010\u0080\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020~H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u000202H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0005\b\u0084\u0001\u0010fJ\u001a\u0010\u0085\u0001\u001a\u00020x2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001e\u0010\u0087\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0016\u0010\u0089\u0001\u001a\u000202H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J)\u0010\u008b\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020c2\t\b\u0002\u0010\u008a\u0001\u001a\u00020xH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J*\u0010\u008f\u0001\u001a\u0002022\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020@0\\2\u0007\u0010\u008e\u0001\u001a\u00020xH\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020cH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0088\u0001J/\u0010\u0095\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J0\u0010\u009a\u0001\u001a\u0002022\u0007\u0010\u0097\u0001\u001a\u00020@2\u000f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0092\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u0002022\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J0\u0010\u009f\u0001\u001a\u0002022\u0007\u0010\u009e\u0001\u001a\u00020c2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u009f\u0001\u0010\u0096\u0001J\u001a\u0010 \u0001\u001a\u0002022\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0006\b \u0001\u0010\u009d\u0001J\u001a\u0010¡\u0001\u001a\u0002022\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0006\b¡\u0001\u0010\u009d\u0001J&\u0010¢\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020hH\u0082@ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010n\u001a\u00020mH\u0082@ø\u0001\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J&\u0010¦\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020hH\u0082@ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010£\u0001J,\u0010§\u0001\u001a\u0002022\u0007\u0010\u009e\u0001\u001a\u00020c2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010©\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010ª\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010«\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¬\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u00ad\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010®\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¯\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010°\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010±\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010²\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010³\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010´\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010µ\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010¶\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010·\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010¸\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010¹\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010º\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010»\u0001R\u001e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u0002050¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020:0¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¾\u0001R \u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020c0À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020@0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020@0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Å\u0001R\u001e\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020@0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010Å\u0001R\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020@0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010Å\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020c0À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Â\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020c0À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Â\u0001R\u0018\u0010Î\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ì\u0001R\u001b\u0010Ï\u0001\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R(\u0010×\u0001\u001a\u00020x2\u0006\u0010Y\u001a\u00020x8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0005\bÖ\u0001\u0010{\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ø\u0001"}, d2 = {"Llx0;", "LYs0;", "LYu0;", "Lbv0;", "LTu0;", "LwI;", "LMs0;", "Llv0;", "LPu0;", "LVr0;", "LWr0;", "_applicationService", "LRu0;", "_sessionService", "Lct0;", "_influenceManager", "LxI;", "_configModelStore", "Lnv0;", "_userManager", "LTv0;", "_identityModelStore", "Lcv0;", "_subscriptionManager", "Lju0;", "_outcomeEventsController", "Lpx0;", "_state", "LZs0;", "_prefs", "Lat0;", "_repository", "LKs0;", "_backend", "Lkv0;", "_triggerController", "Ll52;", "_triggerModelStore", "LLs0;", "_displayer", "LNs0;", "_lifecycle", "Let0;", "_languageContext", "Lgv0;", "_time", "Lls0;", "_consistencyManager", "<init>", "(LWr0;LRu0;Lct0;LxI;Lnv0;LTv0;Lcv0;Lju0;Lpx0;LZs0;Lat0;LKs0;Lkv0;Ll52;LLs0;LNs0;Let0;Lgv0;Lls0;)V", "", "start", "()V", "LUs0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLifecycleListener", "(LUs0;)V", "removeLifecycleListener", "LQs0;", "addClickListener", "(LQs0;)V", "removeClickListener", "LH01;", "args", "", "tag", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "model", "onModelReplaced", "(LwI;Ljava/lang/String;)V", "LZu0;", "subscription", "onSubscriptionAdded", "(LZu0;)V", "onSubscriptionRemoved", "onSubscriptionChanged", "(LZu0;LH01;)V", "onSessionStarted", "onSessionActive", "", "duration", "onSessionEnded", "(J)V", "", "triggers", "addTriggers", "(Ljava/util/Map;)V", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addTrigger", "(Ljava/lang/String;Ljava/lang/String;)V", "", "keys", "removeTriggers", "(Ljava/util/Collection;)V", "removeTrigger", "(Ljava/lang/String;)V", "clearTriggers", "LQw0;", "message", "onMessageWillDisplay", "(LQw0;)V", "onMessageWasDisplayed", "LUw0;", "action", "onMessageActionOccurredOnPreview", "(LQw0;LUw0;)V", "onMessageActionOccurredOnMessage", "Lax0;", "page", "onMessagePageChanged", "(LQw0;Lax0;)V", "onMessageWillDismiss", "onMessageWasDismissed", "triggerId", "onTriggerCompleted", "onTriggerConditionChanged", "newTriggerKey", "onTriggerChanged", "", "firedOnSubscribe", "onFocus", "(Z)V", "onUnfocused", "fetchMessagesWhenConditionIsMet", "LGB1;", "rywData", "fetchMessages", "(LGB1;LJM;)Ljava/lang/Object;", "evaluateInAppMessages", "(LJM;)Ljava/lang/Object;", "setDataForRedisplay", "hasMessageTriggerChanged", "(LQw0;)Z", "queueMessageForDisplay", "(LQw0;LJM;)Ljava/lang/Object;", "attemptToShowInAppMessage", "failed", "messageWasDismissed", "(LQw0;ZLJM;)Ljava/lang/Object;", "newTriggersKeys", "isNewTriggerAdded", "makeRedisplayMessagesAvailableWithTriggers", "(Ljava/util/Collection;Z)V", "persistInAppMessage", "", "Lcx0;", "prompts", "beginProcessingPrompts", "(LQw0;Ljava/util/List;LJM;)Ljava/lang/Object;", "messageId", "LZw0;", "outcomes", "fireOutcomesForClick", "(Ljava/lang/String;Ljava/util/List;LJM;)Ljava/lang/Object;", "fireTagCallForClick", "(LUw0;)V", "inAppMessage", "showMultiplePrompts", "fireClickAction", "logInAppMessagePreviewActions", "firePublicClickHandler", "(LQw0;LUw0;LJM;)Ljava/lang/Object;", "fireRESTCallForPageChange", "(LQw0;Lax0;LJM;)Ljava/lang/Object;", "fireRESTCallForClick", "showAlertDialogMessage", "(LQw0;Ljava/util/List;)V", "LWr0;", "LRu0;", "Lct0;", "LxI;", "Lnv0;", "LTv0;", "Lcv0;", "Lju0;", "Lpx0;", "LZs0;", "Lat0;", "LKs0;", "Lkv0;", "Ll52;", "LLs0;", "LNs0;", "Let0;", "Lgv0;", "Lls0;", "LO80;", "lifecycleCallback", "LO80;", "messageClickCallback", "", "messages", "Ljava/util/List;", "", "dismissedMessages", "Ljava/util/Set;", "impressionedMessages", "viewedPageIds", "clickedClickIds", "messageDisplayQueue", "Lh21;", "messageDisplayQueueMutex", "Lh21;", "redisplayedInAppMessages", "fetchIAMMutex", "lastTimeFetchedIAMs", "Ljava/lang/Long;", "lx0$j", "identityModelChangeHandler", "Llx0$j;", "getPaused", "()Z", "setPaused", "paused", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5196lx0 implements InterfaceC2523Ys0, InterfaceC2529Yu0, InterfaceC3044bv0, InterfaceC2109Tu0<C7371wI>, InterfaceC1554Ms0, InterfaceC5190lv0, InterfaceC1797Pu0, InterfaceC2256Vr0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1399Ks0 _backend;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC5181ls0 _consistencyManager;

    @NotNull
    private final InterfaceC1476Ls0 _displayer;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final InterfaceC3247ct0 _influenceManager;

    @NotNull
    private final InterfaceC3666et0 _languageContext;

    @NotNull
    private final InterfaceC1635Ns0 _lifecycle;

    @NotNull
    private final InterfaceC4767ju0 _outcomeEventsController;

    @NotNull
    private final InterfaceC2601Zs0 _prefs;

    @NotNull
    private final InterfaceC2828at0 _repository;

    @NotNull
    private final InterfaceC1953Ru0 _sessionService;

    @NotNull
    private final C6039px0 _state;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final InterfaceC4980kv0 _triggerController;

    @NotNull
    private final C5018l52 _triggerModelStore;

    @NotNull
    private final InterfaceC5613nv0 _userManager;

    @NotNull
    private final Set<String> clickedClickIds;

    @NotNull
    private final Set<String> dismissedMessages;

    @NotNull
    private final InterfaceC4117h21 fetchIAMMutex;

    @NotNull
    private final j identityModelChangeHandler;

    @NotNull
    private final Set<String> impressionedMessages;

    @Nullable
    private Long lastTimeFetchedIAMs;

    @NotNull
    private final O80<InterfaceC2181Us0> lifecycleCallback;

    @NotNull
    private final O80<InterfaceC1869Qs0> messageClickCallback;

    @NotNull
    private final List<C1881Qw0> messageDisplayQueue;

    @NotNull
    private final InterfaceC4117h21 messageDisplayQueueMutex;

    @NotNull
    private List<C1881Qw0> messages;

    @NotNull
    private final List<C1881Qw0> redisplayedInAppMessages;

    @NotNull
    private final Set<String> viewedPageIds;

    /* JADX INFO: renamed from: lx0$A */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$showAlertDialogMessage$1$1", f = "InAppMessagesManager.kt", l = {954}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class A extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C1881Qw0 $inAppMessage;
        final /* synthetic */ List<AbstractC3259cx0> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public A(C1881Qw0 c1881Qw0, List<? extends AbstractC3259cx0> list, JM<? super A> jm) {
            super(1, jm);
            this.$inAppMessage = c1881Qw0;
            this.$prompts = list;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new A(this.$inAppMessage, this.$prompts, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((A) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                C1881Qw0 c1881Qw0 = this.$inAppMessage;
                List<AbstractC3259cx0> list = this.$prompts;
                this.label = 1;
                if (c5196lx0.showMultiplePrompts(c1881Qw0, list, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$B */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {808, 822}, m = "showMultiplePrompts")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class B extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public B(JM<? super B> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.showMultiplePrompts(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$C */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$start$1", f = "InAppMessagesManager.kt", l = {190, 193}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C extends AW1 implements Function1<JM<? super Unit>, Object> {
        Object L$0;
        int label;

        public C(JM<? super C> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new C(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((C) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0060 A[LOOP:0: B:18:0x005a->B:20:0x0060, LOOP_END] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List list;
            Iterator it;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2828at0 interfaceC2828at0 = C5196lx0.this._repository;
                this.label = 1;
                if (interfaceC2828at0.cleanCachedInAppMessages(this) != mn) {
                }
                return mn;
            }
            if (i == 1) {
                C1795Pt1.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C1795Pt1.b(obj);
            }
            list.addAll((Collection) obj);
            it = C5196lx0.this.redisplayedInAppMessages.iterator();
            while (it.hasNext()) {
                ((C1881Qw0) it.next()).setDisplayedInSession(false);
            }
            return Unit.a;
            List list2 = C5196lx0.this.redisplayedInAppMessages;
            InterfaceC2828at0 interfaceC2828at1 = C5196lx0.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object objListInAppMessages = interfaceC2828at1.listInAppMessages(this);
            if (objListInAppMessages != mn) {
                list = list2;
                obj = objListInAppMessages;
                list.addAll((Collection) obj);
                it = C5196lx0.this.redisplayedInAppMessages.iterator();
                while (it.hasNext()) {
                    ((C1881Qw0) it.next()).setDisplayedInSession(false);
                }
                return Unit.a;
            }
            return mn;
        }
    }

    /* JADX INFO: renamed from: lx0$a, reason: case insensitive filesystem */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {412, 968, 442, 449, 453}, m = "attemptToShowInAppMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C5197a extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C5197a(JM<? super C5197a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.attemptToShowInAppMessage(this);
        }
    }

    /* JADX INFO: renamed from: lx0$b, reason: case insensitive filesystem */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {335}, m = "evaluateInAppMessages")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C5198b extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C5198b(JM<? super C5198b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.evaluateInAppMessages(this);
        }
    }

    /* JADX INFO: renamed from: lx0$c, reason: case insensitive filesystem */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {968, 308, 312}, m = "fetchMessages")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C5199c extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C5199c(JM<? super C5199c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.fetchMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$d */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends ML0 implements Function0<Long> {
        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(C5196lx0.this._time.getCurrentTimeMillis() - C5196lx0.this._sessionService.getStartTime());
        }
    }

    /* JADX INFO: renamed from: lx0$e */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessagesWhenConditionIsMet$1", f = "InAppMessagesManager.kt", l = {271, 272, 275}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public e(JM<? super e> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((e) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                defpackage.C1795Pt1.b(r7)
                goto L5e
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                defpackage.C1795Pt1.b(r7)
                goto L4f
            L1f:
                defpackage.C1795Pt1.b(r7)
                goto L44
            L23:
                defpackage.C1795Pt1.b(r7)
                lx0 r7 = defpackage.C5196lx0.this
                nv0 r7 = defpackage.C5196lx0.access$get_userManager$p(r7)
                java.lang.String r7 = r7.getOnesignalId()
                lx0 r1 = defpackage.C5196lx0.this
                ls0 r1 = defpackage.C5196lx0.access$get_consistencyManager$p(r1)
                qv0 r5 = new qv0
                r5.<init>(r7)
                r6.label = r4
                java.lang.Object r7 = r1.getRywDataFromAwaitableCondition(r5, r6)
                if (r7 != r0) goto L44
                goto L5d
            L44:
                CG r7 = (defpackage.CG) r7
                r6.label = r3
                java.lang.Object r7 = r7.K0(r6)
                if (r7 != r0) goto L4f
                goto L5d
            L4f:
                GB1 r7 = (defpackage.GB1) r7
                if (r7 == 0) goto L5e
                lx0 r1 = defpackage.C5196lx0.this
                r6.label = r2
                java.lang.Object r7 = defpackage.C5196lx0.access$fetchMessages(r1, r7, r6)
                if (r7 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lx0$f */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {773, 775, 777}, m = "fireOutcomesForClick")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.fireOutcomesForClick(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$g */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$firePublicClickHandler$2", f = "InAppMessagesManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQs0;", "it", "", "<anonymous>", "(LQs0;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<InterfaceC1869Qs0, JM<? super Unit>, Object> {
        final /* synthetic */ C2115Tw0 $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C2115Tw0 c2115Tw0, JM<? super g> jm) {
            super(2, jm);
            this.$result = c2115Tw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            g gVar = new g(this.$result, jm);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC1869Qs0 interfaceC1869Qs0, @Nullable JM<? super Unit> jm) {
            return ((g) create(interfaceC1869Qs0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            ((InterfaceC1869Qs0) this.L$0).onClick(this.$result);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$h */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {924}, m = "fireRESTCallForClick")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.fireRESTCallForClick(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$i */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {887}, m = "fireRESTCallForPageChange")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class i extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public i(JM<? super i> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$j */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"lx0$j", "LTu0;", "LSv0;", "model", "", "tag", "", "onModelReplaced", "(LSv0;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class j implements InterfaceC2109Tu0<C2034Sv0> {

        /* JADX INFO: renamed from: lx0$j$a */
        @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1", f = "InAppMessagesManager.kt", l = {139, 140, 142}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ C5196lx0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5196lx0 c5196lx0, String str, JM<? super a> jm) {
                super(1, jm);
                this.this$0 = c5196lx0;
                this.$newOneSignalId = str;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@NotNull JM<?> jm) {
                return new a(this.this$0, this.$newOneSignalId, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable JM<? super Unit> jm) {
                return ((a) create(jm)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004b  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
            
                if (r1.fetchMessages(r7, r6) == r0) goto L22;
             */
            @Override // defpackage.AbstractC7487wq
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    MN r0 = defpackage.MN.d
                    int r1 = r6.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    defpackage.C1795Pt1.b(r7)
                    goto L56
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    defpackage.C1795Pt1.b(r7)
                    goto L47
                L1f:
                    defpackage.C1795Pt1.b(r7)
                    goto L3c
                L23:
                    defpackage.C1795Pt1.b(r7)
                    lx0 r7 = r6.this$0
                    ls0 r7 = defpackage.C5196lx0.access$get_consistencyManager$p(r7)
                    qv0 r1 = new qv0
                    java.lang.String r5 = r6.$newOneSignalId
                    r1.<init>(r5)
                    r6.label = r4
                    java.lang.Object r7 = r7.getRywDataFromAwaitableCondition(r1, r6)
                    if (r7 != r0) goto L3c
                    goto L55
                L3c:
                    CG r7 = (defpackage.CG) r7
                    r6.label = r3
                    java.lang.Object r7 = r7.K0(r6)
                    if (r7 != r0) goto L47
                    goto L55
                L47:
                    GB1 r7 = (defpackage.GB1) r7
                    if (r7 == 0) goto L56
                    lx0 r1 = r6.this$0
                    r6.label = r2
                    java.lang.Object r7 = defpackage.C5196lx0.access$fetchMessages(r1, r7, r6)
                    if (r7 != r0) goto L56
                L55:
                    return r0
                L56:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j() {
        }

        @Override // defpackage.InterfaceC2109Tu0
        public void onModelReplaced(@NotNull C2034Sv0 model, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(tag, "tag");
        }

        @Override // defpackage.InterfaceC2109Tu0
        public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(tag, "tag");
            if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
                Object oldValue = args.getOldValue();
                Intrinsics.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = args.getNewValue();
                Intrinsics.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str = (String) newValue;
                C6443rs0 c6443rs0 = C6443rs0.INSTANCE;
                if (!c6443rs0.isLocalId((String) oldValue) || c6443rs0.isLocalId(str)) {
                    return;
                }
                LY1.suspendifyOnThread$default(0, new a(C5196lx0.this, str, null), 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: lx0$k */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {475, 501, 504}, m = "messageWasDismissed")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class k extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(JM<? super k> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.messageWasDismissed(null, false, this);
        }
    }

    /* JADX INFO: renamed from: lx0$l */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUs0;", "it", "", "invoke", "(LUs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class l extends ML0 implements Function1<InterfaceC2181Us0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2181Us0 interfaceC2181Us0) {
            invoke2(interfaceC2181Us0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2181Us0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onDidDismiss(new C2457Xw0(this.$message));
        }
    }

    /* JADX INFO: renamed from: lx0$m */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnMessage$1", f = "InAppMessagesManager.kt", l = {665, 666, 668, 670}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class m extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C2193Uw0 $action;
        final /* synthetic */ C1881Qw0 $message;
        int label;
        final /* synthetic */ C5196lx0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C2193Uw0 c2193Uw0, C1881Qw0 c1881Qw0, C5196lx0 c5196lx0, JM<? super m> jm) {
            super(1, jm);
            this.$action = c2193Uw0;
            this.$message = c1881Qw0;
            this.this$0 = c5196lx0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new m(this.$action, this.$message, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((m) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                MN r0 = defpackage.MN.d
                int r1 = r7.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                defpackage.C1795Pt1.b(r8)
                goto L8f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                defpackage.C1795Pt1.b(r8)
                goto L71
            L23:
                defpackage.C1795Pt1.b(r8)
                goto L5b
            L27:
                defpackage.C1795Pt1.b(r8)
                goto L48
            L2b:
                defpackage.C1795Pt1.b(r8)
                Uw0 r8 = r7.$action
                Qw0 r1 = r7.$message
                boolean r1 = r1.takeActionAsUnique()
                r8.setFirstClick(r1)
                lx0 r8 = r7.this$0
                Qw0 r1 = r7.$message
                Uw0 r6 = r7.$action
                r7.label = r5
                java.lang.Object r8 = defpackage.C5196lx0.access$firePublicClickHandler(r8, r1, r6, r7)
                if (r8 != r0) goto L48
                goto L8e
            L48:
                lx0 r8 = r7.this$0
                Qw0 r1 = r7.$message
                Uw0 r5 = r7.$action
                java.util.List r5 = r5.getPrompts()
                r7.label = r4
                java.lang.Object r8 = defpackage.C5196lx0.access$beginProcessingPrompts(r8, r1, r5, r7)
                if (r8 != r0) goto L5b
                goto L8e
            L5b:
                lx0 r8 = r7.this$0
                Uw0 r1 = r7.$action
                defpackage.C5196lx0.access$fireClickAction(r8, r1)
                lx0 r8 = r7.this$0
                Qw0 r1 = r7.$message
                Uw0 r4 = r7.$action
                r7.label = r3
                java.lang.Object r8 = defpackage.C5196lx0.access$fireRESTCallForClick(r8, r1, r4, r7)
                if (r8 != r0) goto L71
                goto L8e
            L71:
                lx0 r8 = r7.this$0
                Uw0 r1 = r7.$action
                defpackage.C5196lx0.access$fireTagCallForClick(r8, r1)
                lx0 r8 = r7.this$0
                Qw0 r1 = r7.$message
                java.lang.String r1 = r1.getMessageId()
                Uw0 r3 = r7.$action
                java.util.List r3 = r3.getOutcomes()
                r7.label = r2
                java.lang.Object r8 = defpackage.C5196lx0.access$fireOutcomesForClick(r8, r1, r3, r7)
                if (r8 != r0) goto L8f
            L8e:
                return r0
            L8f:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lx0$n */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnPreview$1", f = "InAppMessagesManager.kt", l = {652, 653}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class n extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C2193Uw0 $action;
        final /* synthetic */ C1881Qw0 $message;
        int label;
        final /* synthetic */ C5196lx0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C2193Uw0 c2193Uw0, C1881Qw0 c1881Qw0, C5196lx0 c5196lx0, JM<? super n> jm) {
            super(1, jm);
            this.$action = c2193Uw0;
            this.$message = c1881Qw0;
            this.this$0 = c5196lx0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new n(this.$action, this.$message, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((n) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r6)
                goto L4c
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                defpackage.C1795Pt1.b(r6)
                goto L39
            L1c:
                defpackage.C1795Pt1.b(r6)
                Uw0 r6 = r5.$action
                Qw0 r1 = r5.$message
                boolean r1 = r1.takeActionAsUnique()
                r6.setFirstClick(r1)
                lx0 r6 = r5.this$0
                Qw0 r1 = r5.$message
                Uw0 r4 = r5.$action
                r5.label = r3
                java.lang.Object r6 = defpackage.C5196lx0.access$firePublicClickHandler(r6, r1, r4, r5)
                if (r6 != r0) goto L39
                goto L4b
            L39:
                lx0 r6 = r5.this$0
                Qw0 r1 = r5.$message
                Uw0 r3 = r5.$action
                java.util.List r3 = r3.getPrompts()
                r5.label = r2
                java.lang.Object r6 = defpackage.C5196lx0.access$beginProcessingPrompts(r6, r1, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                lx0 r6 = r5.this$0
                Uw0 r0 = r5.$action
                defpackage.C5196lx0.access$fireClickAction(r6, r0)
                lx0 r6 = r5.this$0
                Uw0 r0 = r5.$action
                defpackage.C5196lx0.access$logInAppMessagePreviewActions(r6, r0)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lx0$o */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessagePageChanged$1", f = "InAppMessagesManager.kt", l = {683}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class o extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C1881Qw0 $message;
        final /* synthetic */ C2840ax0 $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C1881Qw0 c1881Qw0, C2840ax0 c2840ax0, JM<? super o> jm) {
            super(1, jm);
            this.$message = c1881Qw0;
            this.$page = c2840ax0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new o(this.$message, this.$page, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((o) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                C1881Qw0 c1881Qw0 = this.$message;
                C2840ax0 c2840ax0 = this.$page;
                this.label = 1;
                if (c5196lx0.fireRESTCallForPageChange(c1881Qw0, c2840ax0, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$p */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDismissed$1", f = "InAppMessagesManager.kt", l = {697}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class p extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C1881Qw0 $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C1881Qw0 c1881Qw0, JM<? super p> jm) {
            super(1, jm);
            this.$message = c1881Qw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new p(this.$message, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((p) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                C1881Qw0 c1881Qw0 = this.$message;
                this.label = 1;
                if (C5196lx0.messageWasDismissed$default(c5196lx0, c1881Qw0, false, this, 2, null) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$q */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUs0;", "it", "", "invoke", "(LUs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class q extends ML0 implements Function1<InterfaceC2181Us0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2181Us0 interfaceC2181Us0) {
            invoke2(interfaceC2181Us0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2181Us0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onDidDisplay(new C2457Xw0(this.$message));
        }
    }

    /* JADX INFO: renamed from: lx0$r */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$2", f = "InAppMessagesManager.kt", l = {630}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class r extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C1881Qw0 $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, C1881Qw0 c1881Qw0, JM<? super r> jm) {
            super(1, jm);
            this.$variantId = str;
            this.$message = c1881Qw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new r(this.$variantId, this.$message, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((r) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            r rVar;
            MN mn = MN.d;
            int i = this.label;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    InterfaceC1399Ks0 interfaceC1399Ks0 = C5196lx0.this._backend;
                    String appId = C5196lx0.this._configModelStore.getModel().getAppId();
                    String id = C5196lx0.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    rVar = this;
                    try {
                        if (interfaceC1399Ks0.sendIAMImpression(appId, id, str, messageId, rVar) == mn) {
                            return mn;
                        }
                    } catch (C7063up unused) {
                        C5196lx0.this.impressionedMessages.remove(rVar.$message.getMessageId());
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                    rVar = this;
                }
                C5196lx0.this._prefs.setImpressionesMessagesId(C5196lx0.this.impressionedMessages);
            } catch (C7063up unused2) {
                rVar = this;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$s */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUs0;", "it", "", "invoke", "(LUs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class s extends ML0 implements Function1<InterfaceC2181Us0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2181Us0 interfaceC2181Us0) {
            invoke2(interfaceC2181Us0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2181Us0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onWillDismiss(new C2457Xw0(this.$message));
        }
    }

    /* JADX INFO: renamed from: lx0$t */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUs0;", "it", "", "invoke", "(LUs0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class t extends ML0 implements Function1<InterfaceC2181Us0, Unit> {
        final /* synthetic */ C1881Qw0 $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(C1881Qw0 c1881Qw0) {
            super(1);
            this.$message = c1881Qw0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2181Us0 interfaceC2181Us0) {
            invoke2(interfaceC2181Us0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2181Us0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onWillDisplay(new C2457Xw0(this.$message));
        }
    }

    /* JADX INFO: renamed from: lx0$u */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerChanged$1", f = "InAppMessagesManager.kt", l = {745}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class u extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public u(JM<? super u> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new u(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((u) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                this.label = 1;
                if (c5196lx0.evaluateInAppMessages(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$v */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerConditionChanged$1", f = "InAppMessagesManager.kt", l = {733}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class v extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public v(JM<? super v> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new v(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((v) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                this.label = 1;
                if (c5196lx0.evaluateInAppMessages(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$w */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$1", f = "InAppMessagesManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class w extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public w(JM<? super w> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C5196lx0.this.new w(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((w) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            C5196lx0.this._displayer.dismissCurrentInAppMessage();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$x */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$2", f = "InAppMessagesManager.kt", l = {165}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class x extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public x(JM<? super x> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C5196lx0.this.new x(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((x) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5196lx0 c5196lx0 = C5196lx0.this;
                this.label = 1;
                if (c5196lx0.evaluateInAppMessages(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: lx0$y */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {542}, m = "persistInAppMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class y extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public y(JM<? super y> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.persistInAppMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: lx0$z */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {968, 407}, m = "queueMessageForDisplay")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class z extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public z(JM<? super z> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C5196lx0.this.queueMessageForDisplay(null, this);
        }
    }

    public C5196lx0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1953Ru0 _sessionService, @NotNull InterfaceC3247ct0 _influenceManager, @NotNull C7582xI _configModelStore, @NotNull InterfaceC5613nv0 _userManager, @NotNull C2112Tv0 _identityModelStore, @NotNull InterfaceC3253cv0 _subscriptionManager, @NotNull InterfaceC4767ju0 _outcomeEventsController, @NotNull C6039px0 _state, @NotNull InterfaceC2601Zs0 _prefs, @NotNull InterfaceC2828at0 _repository, @NotNull InterfaceC1399Ks0 _backend, @NotNull InterfaceC4980kv0 _triggerController, @NotNull C5018l52 _triggerModelStore, @NotNull InterfaceC1476Ls0 _displayer, @NotNull InterfaceC1635Ns0 _lifecycle, @NotNull InterfaceC3666et0 _languageContext, @NotNull InterfaceC4092gv0 _time, @NotNull InterfaceC5181ls0 _consistencyManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_userManager, "_userManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_repository, "_repository");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_triggerController, "_triggerController");
        Intrinsics.checkNotNullParameter(_triggerModelStore, "_triggerModelStore");
        Intrinsics.checkNotNullParameter(_displayer, "_displayer");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._userManager = _userManager;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._outcomeEventsController = _outcomeEventsController;
        this._state = _state;
        this._prefs = _prefs;
        this._repository = _repository;
        this._backend = _backend;
        this._triggerController = _triggerController;
        this._triggerModelStore = _triggerModelStore;
        this._displayer = _displayer;
        this._lifecycle = _lifecycle;
        this._languageContext = _languageContext;
        this._time = _time;
        this._consistencyManager = _consistencyManager;
        this.lifecycleCallback = new O80<>();
        this.messageClickCallback = new O80<>();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = ED.c();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = ED.c();
        this.identityModelChangeHandler = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        if (r3.queueMessageForDisplay((defpackage.C1881Qw0) r14, r1) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        if (r3.messageWasDismissed((defpackage.C1881Qw0) r14, true, r1) == r2) goto L63;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptToShowInAppMessage(defpackage.JM<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.attemptToShowInAppMessage(JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(C1881Qw0 c1881Qw0, List<? extends AbstractC3259cx0> list, JM<? super Unit> jm) {
        if (list.isEmpty()) {
            return Unit.a;
        }
        NS0.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + c1881Qw0, null, 2, null);
        this._displayer.dismissCurrentInAppMessage();
        Object objShowMultiplePrompts = showMultiplePrompts(c1881Qw0, list, jm);
        return objShowMultiplePrompts == MN.d ? objShowMultiplePrompts : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object evaluateInAppMessages(JM<? super Unit> jm) {
        C5198b c5198b;
        C5196lx0 c5196lx0;
        Iterator it;
        if (jm instanceof C5198b) {
            c5198b = (C5198b) jm;
            int i2 = c5198b.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5198b.label = i2 - Integer.MIN_VALUE;
            } else {
                c5198b = new C5198b(jm);
            }
        } else {
            c5198b = new C5198b(jm);
        }
        Object obj = c5198b.result;
        MN mn = MN.d;
        int i3 = c5198b.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            NS0.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
            ArrayList arrayList = new ArrayList();
            synchronized (this.messages) {
                try {
                    for (C1881Qw0 c1881Qw0 : this.messages) {
                        if (this._triggerController.evaluateMessageTriggers(c1881Qw0)) {
                            setDataForRedisplay(c1881Qw0);
                            if (!this.dismissedMessages.contains(c1881Qw0.getMessageId()) && !c1881Qw0.isFinished()) {
                                arrayList.add(c1881Qw0);
                            }
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c5196lx0 = this;
            it = arrayList.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c5198b.L$1;
            c5196lx0 = (C5196lx0) c5198b.L$0;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            C1881Qw0 c1881Qw1 = (C1881Qw0) it.next();
            c5198b.L$0 = c5196lx0;
            c5198b.L$1 = it;
            c5198b.label = 1;
            if (c5196lx0.queueMessageForDisplay(c1881Qw1, c5198b) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (r3.evaluateInAppMessages(r8) == r2) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchMessages(defpackage.GB1 r19, defpackage.JM<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.fetchMessages(GB1, JM):java.lang.Object");
    }

    private final void fetchMessagesWhenConditionIsMet() {
        LY1.suspendifyOnThread$default(0, new e(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(C2193Uw0 action) {
        if (action.getUrl() == null || action.getUrl().length() <= 0) {
            return;
        }
        if (action.getUrlTarget() == EnumC2037Sw0.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), action.getUrl());
        } else if (action.getUrlTarget() == EnumC2037Sw0.IN_APP_WEBVIEW) {
            C91.INSTANCE.open$com_onesignal_inAppMessages(action.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fireOutcomesForClick(String str, List<C2613Zw0> list, JM<? super Unit> jm) {
        f fVar;
        Iterator<C2613Zw0> it;
        C5196lx0 c5196lx0;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        Object obj = fVar.result;
        MN mn = MN.d;
        int i3 = fVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            this._influenceManager.onDirectInfluenceFromIAM(str);
            it = list.iterator();
            c5196lx0 = this;
        } else {
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fVar.L$1;
            c5196lx0 = (C5196lx0) fVar.L$0;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            C2613Zw0 next = it.next();
            String name = next.getName();
            if (next.getIsUnique()) {
                InterfaceC4767ju0 interfaceC4767ju0 = c5196lx0._outcomeEventsController;
                fVar.L$0 = c5196lx0;
                fVar.L$1 = it;
                fVar.label = 1;
                if (interfaceC4767ju0.sendUniqueOutcomeEvent(name, fVar) == mn) {
                    return mn;
                }
            } else if (next.getWeight() > 0.0f) {
                InterfaceC4767ju0 interfaceC4767ju1 = c5196lx0._outcomeEventsController;
                float weight = next.getWeight();
                fVar.L$0 = c5196lx0;
                fVar.L$1 = it;
                fVar.label = 2;
                if (interfaceC4767ju1.sendOutcomeEventWithValue(name, weight, fVar) == mn) {
                    return mn;
                }
            } else {
                InterfaceC4767ju0 interfaceC4767ju2 = c5196lx0._outcomeEventsController;
                fVar.L$0 = c5196lx0;
                fVar.L$1 = it;
                fVar.label = 3;
                if (interfaceC4767ju2.sendOutcomeEvent(name, fVar) == mn) {
                    return mn;
                }
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(C1881Qw0 c1881Qw0, C2193Uw0 c2193Uw0, JM<? super Unit> jm) throws Throwable {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return Unit.a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(c1881Qw0.getMessageId());
        Object objSuspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new g(new C2115Tw0(c1881Qw0, c2193Uw0), null), jm);
        return objSuspendingFireOnMain == MN.d ? objSuspendingFireOnMain : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForClick(C1881Qw0 c1881Qw0, C2193Uw0 c2193Uw0, JM<? super Unit> jm) {
        h hVar;
        String clickId;
        C5196lx0 c5196lx0;
        C1881Qw0 c1881Qw1;
        String str;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        h hVar2 = hVar;
        Object obj = hVar2.result;
        MN mn = MN.d;
        int i3 = hVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            String strVariantIdForMessage = C1725Ow0.INSTANCE.variantIdForMessage(c1881Qw0, this._languageContext);
            if (strVariantIdForMessage == null) {
                return Unit.a;
            }
            clickId = c2193Uw0.getClickId();
            if (!(c1881Qw0.getRedisplayStats().getIsRedisplayEnabled() && clickId != null && c1881Qw0.isClickAvailable(clickId)) && CollectionsKt.z(this.clickedClickIds, clickId)) {
                return Unit.a;
            }
            if (clickId != null) {
                this.clickedClickIds.add(clickId);
                c1881Qw0.addClickId(clickId);
            }
            try {
                InterfaceC1399Ks0 interfaceC1399Ks0 = this._backend;
                String appId = this._configModelStore.getModel().getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = c1881Qw0.getMessageId();
                boolean isFirstClick = c2193Uw0.getIsFirstClick();
                hVar2.L$0 = this;
                hVar2.L$1 = c1881Qw0;
                hVar2.L$2 = clickId;
                hVar2.label = 1;
                if (interfaceC1399Ks0.sendIAMClick(appId, id, strVariantIdForMessage, messageId, clickId, isFirstClick, hVar2) == mn) {
                    return mn;
                }
                c5196lx0 = this;
            } catch (C7063up unused) {
                c5196lx0 = this;
                c1881Qw1 = c1881Qw0;
                str = clickId;
                F62.a(c5196lx0.clickedClickIds).remove(str);
                if (str != null) {
                    c1881Qw1.removeClickId(str);
                }
                return Unit.a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) hVar2.L$2;
            c1881Qw1 = (C1881Qw0) hVar2.L$1;
            c5196lx0 = (C5196lx0) hVar2.L$0;
            try {
                C1795Pt1.b(obj);
                clickId = str;
                c1881Qw0 = c1881Qw1;
            } catch (C7063up unused2) {
                F62.a(c5196lx0.clickedClickIds).remove(str);
                if (str != null) {
                    c1881Qw1.removeClickId(str);
                }
            }
        }
        try {
            c5196lx0._prefs.setClickedMessagesId(c5196lx0.clickedClickIds);
        } catch (C7063up unused3) {
            c1881Qw1 = c1881Qw0;
            str = clickId;
            F62.a(c5196lx0.clickedClickIds).remove(str);
            if (str != null) {
                c1881Qw1.removeClickId(str);
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForPageChange(C1881Qw0 c1881Qw0, C2840ax0 c2840ax0, JM<? super Unit> jm) {
        i iVar;
        String str;
        C5196lx0 c5196lx0;
        if (jm instanceof i) {
            iVar = (i) jm;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(jm);
            }
        } else {
            iVar = new i(jm);
        }
        i iVar2 = iVar;
        Object obj = iVar2.result;
        MN mn = MN.d;
        int i3 = iVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            String strVariantIdForMessage = C1725Ow0.INSTANCE.variantIdForMessage(c1881Qw0, this._languageContext);
            if (strVariantIdForMessage == null) {
                return Unit.a;
            }
            String pageId = c2840ax0.getPageId();
            String str2 = c1881Qw0.getMessageId() + pageId;
            if (this.viewedPageIds.contains(str2)) {
                NS0.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                return Unit.a;
            }
            this.viewedPageIds.add(str2);
            try {
                InterfaceC1399Ks0 interfaceC1399Ks0 = this._backend;
                String appId = this._configModelStore.getModel().getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = c1881Qw0.getMessageId();
                iVar2.L$0 = this;
                iVar2.L$1 = str2;
                iVar2.label = 1;
                if (interfaceC1399Ks0.sendIAMPageImpression(appId, id, strVariantIdForMessage, messageId, pageId, iVar2) == mn) {
                    return mn;
                }
                str = str2;
                c5196lx0 = this;
            } catch (C7063up unused) {
                str = str2;
                c5196lx0 = this;
                c5196lx0.viewedPageIds.remove(str);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) iVar2.L$1;
            c5196lx0 = (C5196lx0) iVar2.L$0;
            try {
                C1795Pt1.b(obj);
            } catch (C7063up unused2) {
                c5196lx0.viewedPageIds.remove(str);
            }
        }
        c5196lx0._prefs.setViewPageImpressionedIds(c5196lx0.viewedPageIds);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(C2193Uw0 action) {
        if (action.getTags() != null) {
            C4098gx0 tags = action.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                KD0 kd0 = KD0.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                Intrinsics.checkNotNull(tagsToAdd);
                this._userManager.addTags(kd0.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                KD0 kd1 = KD0.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                Intrinsics.checkNotNull(tagsToRemove);
                this._userManager.removeTags(kd1.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(C1881Qw0 message) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(message)) {
            return !message.getIsDisplayedInSession();
        }
        return message.getIsTriggerChanged() || (!message.getIsDisplayedInSession() && message.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(C2193Uw0 action) {
        if (action.getTags() != null) {
            NS0.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + action.getTags(), null, 2, null);
        }
        if (action.getOutcomes().size() > 0) {
            NS0.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + action.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> newTriggersKeys, boolean isNewTriggerAdded) {
        synchronized (this.messages) {
            try {
                for (C1881Qw0 c1881Qw0 : this.messages) {
                    boolean zContains = this.redisplayedInAppMessages.contains(c1881Qw0);
                    boolean zIsTriggerOnMessage = this._triggerController.isTriggerOnMessage(c1881Qw0, newTriggersKeys);
                    boolean zMessageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(c1881Qw0);
                    if (!c1881Qw0.getIsTriggerChanged() && zContains && (zIsTriggerOnMessage || (isNewTriggerAdded && zMessageHasOnlyDynamicTriggers))) {
                        NS0.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + c1881Qw0, null, 2, null);
                        c1881Qw0.setTriggerChanged(true);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (persistInAppMessage(r10, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (r11.attemptToShowInAppMessage(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r11.evaluateInAppMessages(r0) == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object messageWasDismissed(defpackage.C1881Qw0 r10, boolean r11, defpackage.JM<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.messageWasDismissed(Qw0, boolean, JM):java.lang.Object");
    }

    public static /* synthetic */ Object messageWasDismissed$default(C5196lx0 c5196lx0, C1881Qw0 c1881Qw0, boolean z2, JM jm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return c5196lx0.messageWasDismissed(c1881Qw0, z2, jm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object persistInAppMessage(C1881Qw0 c1881Qw0, JM<? super Unit> jm) {
        y yVar;
        C5196lx0 c5196lx0;
        if (jm instanceof y) {
            yVar = (y) jm;
            int i2 = yVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.label = i2 - Integer.MIN_VALUE;
            } else {
                yVar = new y(jm);
            }
        } else {
            yVar = new y(jm);
        }
        Object obj = yVar.result;
        MN mn = MN.d;
        int i3 = yVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            c1881Qw0.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            c1881Qw0.getRedisplayStats().incrementDisplayQuantity();
            c1881Qw0.setTriggerChanged(false);
            c1881Qw0.setDisplayedInSession(true);
            InterfaceC2828at0 interfaceC2828at0 = this._repository;
            yVar.L$0 = this;
            yVar.L$1 = c1881Qw0;
            yVar.label = 1;
            if (interfaceC2828at0.saveInAppMessage(c1881Qw0, yVar) == mn) {
                return mn;
            }
            c5196lx0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1881Qw0 = (C1881Qw0) yVar.L$1;
            c5196lx0 = (C5196lx0) yVar.L$0;
            C1795Pt1.b(obj);
        }
        c5196lx0._prefs.setLastTimeInAppDismissed(c5196lx0._state.getLastTimeInAppDismissed());
        int iIndexOf = c5196lx0.redisplayedInAppMessages.indexOf(c1881Qw0);
        if (iIndexOf != -1) {
            c5196lx0.redisplayedInAppMessages.set(iIndexOf, c1881Qw0);
        } else {
            c5196lx0.redisplayedInAppMessages.add(c1881Qw0);
        }
        NS0.debug$default("InAppMessagesManager.persistInAppMessage: " + c1881Qw0 + " with msg array data: " + c5196lx0.redisplayedInAppMessages, null, 2, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queueMessageForDisplay(defpackage.C1881Qw0 r9, defpackage.JM<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "InAppMessagesManager.queueMessageForDisplay: In app message with id: "
            boolean r1 = r10 instanceof defpackage.C5196lx0.z
            if (r1 == 0) goto L15
            r1 = r10
            lx0$z r1 = (defpackage.C5196lx0.z) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            lx0$z r1 = new lx0$z
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.result
            MN r2 = defpackage.MN.d
            int r3 = r1.label
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L47
            if (r3 == r4) goto L35
            if (r3 != r5) goto L2d
            defpackage.C1795Pt1.b(r10)
            goto La9
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r1.L$2
            h21 r9 = (defpackage.InterfaceC4117h21) r9
            java.lang.Object r3 = r1.L$1
            Qw0 r3 = (defpackage.C1881Qw0) r3
            java.lang.Object r4 = r1.L$0
            lx0 r4 = (defpackage.C5196lx0) r4
            defpackage.C1795Pt1.b(r10)
            r10 = r9
            r9 = r3
            goto L5c
        L47:
            defpackage.C1795Pt1.b(r10)
            h21 r10 = r8.messageDisplayQueueMutex
            r1.L$0 = r8
            r1.L$1 = r9
            r1.L$2 = r10
            r1.label = r4
            java.lang.Object r3 = r10.a(r1)
            if (r3 != r2) goto L5b
            goto La8
        L5b:
            r4 = r8
        L5c:
            r3 = 0
            java.util.List<Qw0> r6 = r4.messageDisplayQueue     // Catch: java.lang.Throwable -> L93
            boolean r6 = r6.contains(r9)     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L95
            px0 r6 = r4._state     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.getInAppMessageIdShowing()     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r9.getMessageId()     // Catch: java.lang.Throwable -> L93
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r7)     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L95
            java.util.List<Qw0> r6 = r4.messageDisplayQueue     // Catch: java.lang.Throwable -> L93
            r6.add(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r9.getMessageId()     // Catch: java.lang.Throwable -> L93
            r6.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = ", added to the queue"
            r6.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L93
            defpackage.NS0.debug$default(r9, r3, r5, r3)     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r9 = move-exception
            goto Lac
        L95:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L93
            r10.b(r3)
            r1.L$0 = r3
            r1.L$1 = r3
            r1.L$2 = r3
            r1.label = r5
            java.lang.Object r9 = r4.attemptToShowInAppMessage(r1)
            if (r9 != r2) goto La9
        La8:
            return r2
        La9:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lac:
            r10.b(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.queueMessageForDisplay(Qw0, JM):java.lang.Object");
    }

    private final void setDataForRedisplay(C1881Qw0 message) {
        boolean zContains = this.dismissedMessages.contains(message.getMessageId());
        int iIndexOf = this.redisplayedInAppMessages.indexOf(message);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        C1881Qw0 c1881Qw0 = this.redisplayedInAppMessages.get(iIndexOf);
        message.getRedisplayStats().setDisplayStats(c1881Qw0.getRedisplayStats());
        message.setDisplayedInSession(c1881Qw0.getIsDisplayedInSession());
        boolean zHasMessageTriggerChanged = hasMessageTriggerChanged(message);
        NS0.debug$default("InAppMessagesManager.setDataForRedisplay: " + message + " triggerHasChanged: " + zHasMessageTriggerChanged, null, 2, null);
        if (zHasMessageTriggerChanged && message.getRedisplayStats().isDelayTimeSatisfied() && message.getRedisplayStats().shouldDisplayAgain()) {
            NS0.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + message.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(message.getMessageId());
            this.impressionedMessages.remove(message.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            message.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final C1881Qw0 inAppMessage, final List<? extends AbstractC3259cx0> prompts) {
        String string = this._applicationService.getAppContext().getString(C1534Ml1.location_permission_missing_title);
        Intrinsics.checkNotNullExpressionValue(string, "_applicationService.appC…permission_missing_title)");
        String string2 = this._applicationService.getAppContext().getString(C1534Ml1.location_permission_missing_message);
        Intrinsics.checkNotNullExpressionValue(string2, "_applicationService.appC…rmission_missing_message)");
        new AlertDialog.Builder(this._applicationService.get_current()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: kx0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C5196lx0.m18showAlertDialogMessage$lambda7(this.d, inAppMessage, prompts, dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showAlertDialogMessage$lambda-7, reason: not valid java name */
    public static final void m18showAlertDialogMessage$lambda7(C5196lx0 this$0, C1881Qw0 inAppMessage, List prompts, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inAppMessage, "$inAppMessage");
        Intrinsics.checkNotNullParameter(prompts, "$prompts");
        LY1.suspendifyOnThread$default(0, this$0.new A(inAppMessage, prompts, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:17:0x0062->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b6 -> B:25:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object showMultiplePrompts(defpackage.C1881Qw0 r20, java.util.List<? extends defpackage.AbstractC3259cx0> r21, defpackage.JM<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5196lx0.showMultiplePrompts(Qw0, java.util.List, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: addClickListener */
    public void mo19addClickListener(@NotNull InterfaceC1869Qs0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: addLifecycleListener */
    public void mo20addLifecycleListener(@NotNull InterfaceC2181Us0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: addTrigger */
    public void mo21addTrigger(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        NS0.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        C4808k52 c4808k52 = (C4808k52) this._triggerModelStore.get(key);
        if (c4808k52 != null) {
            c4808k52.setValue(value);
            return;
        }
        C4808k52 c4808k53 = new C4808k52();
        c4808k53.setId(key);
        c4808k53.setKey(key);
        c4808k53.setValue(value);
        InterfaceC7076ut0.a.add$default(this._triggerModelStore, c4808k53, null, 2, null);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: addTriggers */
    public void mo22addTriggers(@NotNull Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        NS0.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo21addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: clearTriggers */
    public void mo23clearTriggers() {
        NS0.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        InterfaceC7076ut0.a.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // defpackage.InterfaceC2523Ys0
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageActionOccurredOnMessage(@NotNull C1881Qw0 message, @NotNull C2193Uw0 action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        LY1.suspendifyOnThread$default(0, new m(action, message, this, null), 1, null);
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageActionOccurredOnPreview(@NotNull C1881Qw0 message, @NotNull C2193Uw0 action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        LY1.suspendifyOnThread$default(0, new n(action, message, this, null), 1, null);
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessagePageChanged(@NotNull C1881Qw0 message, @NotNull C2840ax0 page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        if (message.getIsPreview()) {
            return;
        }
        LY1.suspendifyOnThread$default(0, new o(message, page, null), 1, null);
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageWasDismissed(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LY1.suspendifyOnThread$default(0, new p(message, null), 1, null);
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageWasDisplayed(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new q(message));
        } else {
            NS0.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.getIsPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String strVariantIdForMessage = C1725Ow0.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (strVariantIdForMessage == null) {
            return;
        }
        LY1.suspendifyOnThread$default(0, new r(strVariantIdForMessage, message, null), 1, null);
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageWillDismiss(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(message));
        } else {
            NS0.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // defpackage.InterfaceC1554Ms0
    public void onMessageWillDisplay(@NotNull C1881Qw0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new t(message));
        } else {
            NS0.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        Iterator<C1881Qw0> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionAdded(@NotNull InterfaceC2607Zu0 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionChanged(@NotNull InterfaceC2607Zu0 subscription, @NotNull H01 args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if ((subscription instanceof InterfaceC7500wu0) && Intrinsics.a(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionRemoved(@NotNull InterfaceC2607Zu0 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // defpackage.InterfaceC5190lv0
    public void onTriggerChanged(@NotNull String newTriggerKey) {
        Intrinsics.checkNotNullParameter(newTriggerKey, "newTriggerKey");
        NS0.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(VE.c(newTriggerKey), true);
        LY1.suspendifyOnThread$default(0, new u(null), 1, null);
    }

    @Override // defpackage.InterfaceC5190lv0
    public void onTriggerCompleted(@NotNull String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        NS0.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + triggerId, null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // defpackage.InterfaceC5190lv0
    public void onTriggerConditionChanged(@NotNull String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        NS0.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(VE.c(triggerId), false);
        LY1.suspendifyOnThread$default(0, new v(null), 1, null);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: removeClickListener */
    public void mo24removeClickListener(@NotNull InterfaceC1869Qs0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: removeLifecycleListener */
    public void mo25removeLifecycleListener(@NotNull InterfaceC2181Us0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: removeTrigger */
    public void mo26removeTrigger(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        NS0.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        InterfaceC7076ut0.a.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: removeTriggers */
    public void mo27removeTriggers(@NotNull Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        NS0.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo26removeTrigger((String) it.next());
        }
    }

    @Override // defpackage.InterfaceC2523Ys0
    public void setPaused(boolean z2) {
        NS0.debug$default("InAppMessagesManager.setPaused(value: " + z2 + ')', null, 2, null);
        this._state.setPaused(z2);
        if (z2 && this._state.getInAppMessageIdShowing() != null) {
            C6215qm0 c6215qm0 = C6215qm0.d;
            RV rv = C6266r20.a;
            C5189lv.k(c6215qm0, QV0.a, new w(null), 2);
        }
        if (z2) {
            return;
        }
        LY1.suspendifyOnThread$default(0, new x(null), 1, null);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((InterfaceC2109Tu0) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((InterfaceC2109Tu0) this.identityModelChangeHandler);
        LY1.suspendifyOnThread$default(0, new C(null), 1, null);
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelReplaced(@NotNull C7371wI model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onUnfocused() {
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onFocus(boolean firedOnSubscribe) {
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
    }
}
