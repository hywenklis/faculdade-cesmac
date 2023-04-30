import * as React from 'react';
import { View, Text, ImageBackground, ImageSourcePropType } from 'react-native';
import imagemFundo from './../../../assets/imgs/background.png';


export function componente() {
  return (
    <ImageBackground source={imagemFundo} style={{ width: '100%', height: '100%' }}>
      <View>
        <Text>Login Screen</Text>
      </View>
    </ImageBackground>
  );
}

