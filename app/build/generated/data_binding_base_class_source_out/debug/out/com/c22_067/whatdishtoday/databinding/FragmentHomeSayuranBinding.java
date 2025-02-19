// Generated by view binder compiler. Do not edit!
package com.c22_067.whatdishtoday.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.c22_067.whatdishtoday.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeSayuranBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView rvMainCategory;

  @NonNull
  public final RecyclerView rvSubCategory;

  @NonNull
  public final TextView tvAll;

  @NonNull
  public final TextView tvMustTry;

  private FragmentHomeSayuranBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView rvMainCategory, @NonNull RecyclerView rvSubCategory,
      @NonNull TextView tvAll, @NonNull TextView tvMustTry) {
    this.rootView = rootView;
    this.rvMainCategory = rvMainCategory;
    this.rvSubCategory = rvSubCategory;
    this.tvAll = tvAll;
    this.tvMustTry = tvMustTry;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeSayuranBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeSayuranBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_sayuran, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeSayuranBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_main_category;
      RecyclerView rvMainCategory = ViewBindings.findChildViewById(rootView, id);
      if (rvMainCategory == null) {
        break missingId;
      }

      id = R.id.rv_sub_category;
      RecyclerView rvSubCategory = ViewBindings.findChildViewById(rootView, id);
      if (rvSubCategory == null) {
        break missingId;
      }

      id = R.id.tvAll;
      TextView tvAll = ViewBindings.findChildViewById(rootView, id);
      if (tvAll == null) {
        break missingId;
      }

      id = R.id.tv_must_try;
      TextView tvMustTry = ViewBindings.findChildViewById(rootView, id);
      if (tvMustTry == null) {
        break missingId;
      }

      return new FragmentHomeSayuranBinding((RelativeLayout) rootView, rvMainCategory,
          rvSubCategory, tvAll, tvMustTry);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
